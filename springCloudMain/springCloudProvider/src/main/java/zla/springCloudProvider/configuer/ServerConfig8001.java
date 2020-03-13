package zla.springCloudProvider.configuer;

import org.springframework.boot.context.embedded.EmbeddedServletContainerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Component
public class ServerConfig8001 implements ApplicationListener<EmbeddedServletContainerInitializedEvent> {
    public int getServerPort() {
        return serverPort;
    }

    private int serverPort;

    public String getUrl() {
        InetAddress address = null;
        try {
            address = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return "http://"+address.getHostAddress()+":"+this.serverPort;
    }

    public String getHost() {
        InetAddress address = null;
        try {
            address = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return address.getHostAddress();
    }


    @Override
    public void onApplicationEvent(EmbeddedServletContainerInitializedEvent embeddedServletContainerInitializedEvent) {
        serverPort = embeddedServletContainerInitializedEvent.getEmbeddedServletContainer().getPort();
    }
}