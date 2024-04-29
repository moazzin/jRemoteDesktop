//package ir.mzn.jRemoteDesktop.server;
//
//import java.nio.ByteBuffer;
//import java.nio.MappedByteBuffer;
//import java.nio.channels.FileChannel;
//import java.util.Map;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.integration.annotation.InboundChannelAdapter;
//import org.springframework.integration.annotation.Poller;
//import org.springframework.integration.annotation.ServiceActivator;
//import org.springframework.integration.endpoint.MessageProducerSupport;
//import org.springframework.integration.file.FileWritingMessageHandler;
//import org.springframework.integration.mapping.InboundMessageMapper;
//import org.springframework.messaging.Message;
//import org.springframework.stereotype.Component;
//import org.springframework.web.socket.BinaryMessage;
//import org.springframework.web.socket.WebSocketSession;
//import org.springframework.web.socket.handler.BinaryWebSocketHandler;
//
//@Component
//public class UploadHandler extends BinaryWebSocketHandler implements InboundMessageMapper<ByteBuffer> {
//
//	// afterConnectionEstablished
//
//	@Override
//    public void handleBinaryMessage(WebSocketSession session, BinaryMessage message) {
//		try {
//			// Get file chunk
//			ByteBuffer sentData = message.getPayload();
//			//MappedByteBuffer outBuf = out.map(FileChannel.MapMode.READ_WRITE, this.uploadPosition, sentData.remaining());
//			/*outBuf.put(*/sentData.array()/*)*/;
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//    }
//
//	@Bean
//	WebSocketInboundChannelAdapter
//
//	@Bean
//	@InboundChannelAdapter(value = "streamChannel", poller = @Poller(fixedDelay = "1000"))
//	public MessageProducerSupport streamMessageSource() {
//		return new MessageProducerSupport() {
//		};
//	}
//
//	@Bean
//	@ServiceActivator(inputChannel= "fileChannel")
//	public MessageHandler fileWritingMessageHandler() {
//		FileWritingMessageHandler handler = new FileWritingMessageHandler(new File(OUTPUT_DIR));
//		handler.setFileExistsMode(FileExistsMode.REPLACE);
//		handler.setExpectReply(false);
//		return handler;
//	}
//
//	@Override
//	public Message<?> toMessage(ByteBuffer object) {
//		return InboundMessageMapper.super.toMessage(object);
//	}
//
//	@Override
//	public Message<?> toMessage(ByteBuffer object, Map<String, Object> headers) {
//		return null;
//	}
//}