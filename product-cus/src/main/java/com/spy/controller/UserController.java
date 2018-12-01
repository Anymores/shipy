package com.spy.controller;

import com.spy.entity.User;
import com.spy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/getUsers")
    @ResponseBody
    public User getUsers(){
        return userService.getUsers();
    }

}
