//package ir.mzn.jRemoteDesktop.server;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.integration.config.EnableIntegration;
//import org.springframework.messaging.simp.config.MessageBrokerRegistry;
//import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
//import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
//import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
//import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;
//
//@Configuration
//@EnableWebSocketMessageBroker
//public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
//
////    @Override
////    public void configureMessageBroker(MessageBrokerRegistry config) {
////        config.enableSimpleBroker("/topic");
////        config.setApplicationDestinationPrefixes("/app");
////    }
////
////    @Override
////    public void registerStompEndpoints(StompEndpointRegistry registry) {
////         registry.addEndpoint("/chat");
////         registry.addEndpoint("/chat").withSockJS();
////    }
//
//    @Override
//    public void registerStompEndpoints(StompEndpointRegistry registry) {
//        registry.addEndpoint("/fellowGenius").setAllowedOrigins("*")
//                .addInterceptors(new HttpSessionHandshakeInterceptor()).withSockJS()
//                .setStreamBytesLimit(104857600*3)
//                .setHttpMessageCacheSize(100000)
//                .setDisconnectDelay(200 * 1000);;
//    }
//
//    @Override
//    public void configureMessageBroker(MessageBrokerRegistry config) {
//        config.enableSimpleBroker("/inbox/");
//    }
//}
