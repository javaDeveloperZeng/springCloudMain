package zla.springCloudConsumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="user-provider",fallback = FeignServiceFallBack.class)
public interface FeignService {
    //地址为服务提供者对外暴露的地址
    @RequestMapping(value = "user/hello" , method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);
}
