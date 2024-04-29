//package ir.mzn.jRemoteDesktop.server;
//
//import org.springframework.integration.annotation.Gateway;
//import org.springframework.integration.annotation.MessagingGateway;
//import org.springframework.messaging.handler.annotation.MessageMapping;
//import org.springframework.messaging.handler.annotation.SendTo;
//import org.springframework.messaging.simp.annotation.SendToUser;
//import org.springframework.stereotype.Controller;
//
//@MessagingGateway
//@Controller
//public interface WebSocketGateway {
//    @MessageMapping("/desktop_stream")
////    @MessageMapping("/desktop_stream/{bookingId}")
////    @SendToUser("/queue/answer")
////    @SendTo("/inbox/desktop_stream")
////    @SendTo("/inbox/MeetingChat/{bookingId}")
//    @Gateway(requestChannel = "desktopStreamChannel")
//    String pushStream(byte[] payload);
//
//}