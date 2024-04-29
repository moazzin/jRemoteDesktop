package ir.mzn.jRemoteDesktop.server;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/*
 * Author: Dikai Xiong
 * Date: 2/10/2019
 */

@Configuration
@EnableWebSocket
public class WebSocketConfiguration implements WebSocketConfigurer {

	@Override
	public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
		registry.addHandler(uploadHandler(), "/screen_up");
	}
	
	@Bean
	public UploadHandler uploadHandler() {
		return new UploadHandler();
	}
	
}