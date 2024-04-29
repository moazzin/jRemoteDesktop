//package ir.mzn.jRemoteDesktop.server;
//
//import ir.mostashar.api.infra_stracture.UserPrinciple;
//import ir.mostashar.api.services.LawyerStatusRedisService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.http.codec.ServerSentEvent;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import reactor.core.publisher.Flux;
//
//import java.security.Principal;
//import java.time.Duration;
//import java.util.UUID;
//
//@Controller
//@RequestMapping("/desktop")
//public class LawyerSse {
//
//    @PutMapping("/sse")
//    public Flux<ServerSentEvent<String>> streamEvents(Principal principal) {
//        if (principal instanceof UsernamePasswordAuthenticationToken) {
//            UsernamePasswordAuthenticationToken upat = (UsernamePasswordAuthenticationToken) principal;
//            Object obj = upat.getPrincipal();
//            if (obj instanceof UserPrinciple) {
//                System.out.println(" ========================================================= SSE ===================================================================");
//                UserPrinciple up = (UserPrinciple) obj;
//                UUID uuid = UUID.fromString(up.getUid());
//                return Flux.interval(Duration.ofSeconds(ssePeriod))
//                        .map(sequence -> ServerSentEvent.<String>builder()
//                                .id(String.valueOf(sequence))
//                                .event("periodic-event")
//                                .data(redisService.beat(uuid).toString())
//                                .comment(redisService.getRaw(uuid))
//                                .build());
//            }
//        }
//        return Flux.just("0")
//                .map(val -> ServerSentEvent.<String>builder()
//                        .id(val)
//                        .event("no-event")
//                        .data(val)
//                        .build());
//
//    }
//}
