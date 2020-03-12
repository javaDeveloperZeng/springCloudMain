package zla.springCloudMain;/**
 * @title: ApplicationEureka
 * @projectName springCloudMain
 * @description: TODO
 * @author ZLS
 * @date 2020/3/1219:21
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *@Description TODO
 *@Author ZLS
 *@Date 2020/3/12 19:21
 **/
@SpringBootApplication
@EnableEurekaServer
public class ApplicationEureka {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationEureka.class,args);
    }
}
