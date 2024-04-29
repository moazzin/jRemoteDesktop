//package ir.mzn.jRemoteDesktop.server;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.integration.channel.DirectChannel;
//import org.springframework.integration.config.EnableIntegration;
//import org.springframework.messaging.MessageChannel;
//import org.springframework.web.socket.config.annotation.EnableWebSocket;
//import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
//import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
//
//@Configuration
//@EnableWebSocket
//@EnableIntegration
//public class WebSocketConfiguration implements WebSocketConfigurer {
//
//	private final UploadHandler uploadHandler;
//
//    public WebSocketConfiguration(UploadHandler uploadHandler) {
//        this.uploadHandler = uploadHandler;
//    }
//
//    @Override
//	public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
//		registry.addHandler(uploadHandler, "/upload");
//	}
//
//	@Bean
//	public MessageChannel streamChannel() {
//		return new DirectChannel();
//	}
//
//}