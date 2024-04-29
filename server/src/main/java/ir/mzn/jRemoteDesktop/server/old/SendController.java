//package ir.mzn.jRemoteDesktop.server;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.messaging.handler.annotation.MessageMapping;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@Controller
//public class SendController {
//
//    @Autowired
//    private IntegrationGateway integrationGateway;
//
//    @MessageMapping("/{name}")
//    public void send(@PathVariable String name) {
//        integrationGateway.send(name);
//    }
//}