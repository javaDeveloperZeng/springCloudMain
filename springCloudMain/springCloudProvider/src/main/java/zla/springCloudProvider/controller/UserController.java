package zla.springCloudProvider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import zla.springCloudProvider.configuer.ServerConfig8001;
import zla.springCloudProvider.service.IUserService;
import zla.springCloudapi.model.user.UserEntity;

import java.util.List;

/**
 *@Description TODO
 *@Author ZLS
 *@Date 2020/3/12 12:35
 **/
@RestController
public class UserController {
    private static final String REST_URL_PREFIX = "http://user-consumer";

    @Autowired
    private IUserService userService;
    @Autowired
    private ServerConfig8001 serverConfig8001;
    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/user/createUser")
    public boolean createUser(@RequestBody UserEntity user){
        return userService.createUser(user);
    }

    @GetMapping("/user/getUser/{id}")
    public UserEntity getUser(@PathVariable("id") Integer id){
        return userService.getUser(id);
    }

    @GetMapping("/user/listUser")
    public List<UserEntity> listUser(){
        return userService.listUser();
    }

    @GetMapping("/user/getPort")
    public String  getPort(){
        return "当前端口为："+serverConfig8001.getServerPort()+"";
    }

    @RequestMapping("/user/consumer/getPort")
    public String getPortConsumer(){
        return  restTemplate.getForObject(REST_URL_PREFIX+"//consumer/getPort",String.class);
    }
    @RequestMapping(value = "user/hello" , method = RequestMethod.GET)
    public String hello(@RequestParam("name") String name){
        return "调用user"+name;
    };
}

