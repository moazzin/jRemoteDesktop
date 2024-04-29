package ir.mzn.jRemoteDesktop.server;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.function.Consumer;
import java.util.function.Supplier;

import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.endpoint.MessageProducerSupport;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.web.socket.BinaryMessage;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.BinaryWebSocketHandler;

public class UploadHandler extends BinaryWebSocketHandler {
	private Consumer<ByteBuffer> onReceiveListener;

	@Override
    public void handleBinaryMessage(WebSocketSession session, BinaryMessage message) {
		if (onReceiveListener != null) {
			onReceiveListener.accept(message.getPayload());
		}
		session.getId();
		TextMessage response = new TextMessage(System.currentTimeMillis()+"");
		try {
			session.sendMessage(response);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
    }

//	@Bean
//	@InboundChannelAdapter(value = "splitChannel", poller = @Poller(fixedDelay = "1000", maxMessagesPerPoll = "1"))
//	public MessageProducerSupport webSocketSessionsMessageSource() {
//		return new MessageProducerSupport() {
//			@Override
//			public void setOutputChannel(MessageChannel outputChannel) {
//				var d = new DirectChannel();
//				d.send(new Message<ByteBuffer>() {
//					@Override
//					public ByteBuffer getPayload() {
//						return sentData;
//					}
//
//					@Override
//					public MessageHeaders getHeaders() {
//						return null;
//					}
//				});
//				super.setOutputChannel(d);
//			}
//		}
//		return () -> new GenericMessage<>(serverWebSocketContainer().getSessions().keySet().iterator());
//	}


	public void setOnReceiveListener(Consumer<ByteBuffer> consumer) {
		this.onReceiveListener = consumer;
	}
}