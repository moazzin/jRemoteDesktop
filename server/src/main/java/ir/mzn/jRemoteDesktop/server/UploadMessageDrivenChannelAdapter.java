package ir.mzn.jRemoteDesktop.server;

import org.springframework.integration.endpoint.MessageProducerSupport;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

public class UploadMessageDrivenChannelAdapter extends MessageProducerSupport {
    private final UploadHandler uploadHandler;

    public UploadMessageDrivenChannelAdapter(UploadHandler uploadHandler, MessageChannel outputChannel) {
        this.uploadHandler = uploadHandler;
        super.setOutputChannel(outputChannel);
        uploadHandler.setOnReceiveListener((bb) -> outputChannel.send(MessageBuilder.withPayload(bb).build(), 1000));
    }



}
