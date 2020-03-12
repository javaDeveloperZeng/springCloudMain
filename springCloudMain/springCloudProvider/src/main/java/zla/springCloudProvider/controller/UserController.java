package zla.springCloudProvider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    @Autowired
    private IUserService userService;

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
}

