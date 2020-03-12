package zla.springCloudConsumer.controller;/**
 * @title: UserController
 * @projectName springCloudMain
 * @description: TODO
 * @author ZLS
 * @date 2020/3/1213:46
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import zla.springCloudapi.model.user.UserEntity;

import java.util.List;

/**
 *@Description TODO
 *@Author ZLS
 *@Date 2020/3/12 13:46
 **/
@RestController
public class UserController {
    private static final String REST_URL_PREFIX = "http://127.0.0.1:8001";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/user/add")
    public boolean add(UserEntity user) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/user/createUser", user, Boolean.class);
    }

    @RequestMapping(value = "/consumer/user/getUser/{id}")
    public UserEntity get(@PathVariable("id") Integer id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/user/getUser/" + id, UserEntity.class);
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/consumer/user/listUser")
    public List<UserEntity> list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/user/listUser", List.class);
    }

}
