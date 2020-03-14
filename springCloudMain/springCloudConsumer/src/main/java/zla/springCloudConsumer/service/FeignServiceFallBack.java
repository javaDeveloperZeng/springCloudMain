package zla.springCloudConsumer.service;

import org.springframework.stereotype.Component;

@Component
public class FeignServiceFallBack implements FeignService{
    @Override
    public String hello(String name) {
        return "熔断机制开启";
    }
}
