package ir.mzn.jRemoteDesktop.server;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
public class WebSocketController {
        
    // sending files inside the meeting
    @MessageMapping("/sendFile/{bookingId}")
    @SendTo("/inbox/MeetingChat/{bookingId}")
    public String onRecievedFile(@DestinationVariable String bookingId,@Payload String file) {
        return file;
    }
}