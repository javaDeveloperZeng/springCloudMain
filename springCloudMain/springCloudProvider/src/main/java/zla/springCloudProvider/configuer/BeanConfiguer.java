package zla.springCloudProvider.configuer;/**
 * @title: BeanConfiguer
 * @projectName springCloudMain
 * @description: TODO
 * @author ZLS
 * @date 2020/3/1213:50
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 *@Description TODO
 *@Author ZLS
 *@Date 2020/3/12 13:50
 **/
@Configuration
public class BeanConfiguer {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
