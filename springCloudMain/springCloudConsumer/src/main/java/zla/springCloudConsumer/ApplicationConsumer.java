package zla.springCloudConsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import zla.springCloudConsumer.configuer.RibbonConfig;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@RibbonClient(name="user-provider",configuration= RibbonConfig.class)
@EnableFeignClients
@EnableHystrix
public class ApplicationConsumer
{
    public static void main( String[] args )
    {
        SpringApplication.run(ApplicationConsumer.class,args);
    }
}
