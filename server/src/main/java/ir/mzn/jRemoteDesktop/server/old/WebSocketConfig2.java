//package ir.mzn.jRemoteDesktop.server;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.integration.annotation.IntegrationComponentScan;
//import org.springframework.integration.annotation.ServiceActivator;
//import org.springframework.integration.channel.DirectChannel;
//import org.springframework.integration.config.EnableIntegration;
//import org.springframework.integration.websocket.IntegrationWebSocketContainer;
//import org.springframework.integration.websocket.ServerWebSocketContainer;
//import org.springframework.integration.websocket.outbound.WebSocketOutboundMessageHandler;
//import org.springframework.messaging.MessageChannel;
//import org.springframework.messaging.MessageHandler;
//
//@Configuration
//@EnableIntegration
//@IntegrationComponentScan
//public class WebSocketConfig {
//
//    @Bean
//    public IntegrationWebSocketContainer serverWebSocketContainer() {
//        return new ServerWebSocketContainer("/desktop_stream");
//    }
//
//    @Bean
//    @ServiceActivator(inputChannel = "desktopStreamChannel")
//    public MessageHandler webSocketOutboundMessageHandler() {
//        return new WebSocketOutboundMessageHandler(serverWebSocketContainer());
//    }
//
//    @Bean
//    public MessageChannel requestChannel() {
//        return new DirectChannel();
//    }
//}