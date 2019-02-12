package com.spy.controller;

import com.spy.entity.User;
import com.spy.entity.demo.PageRet;
import com.spy.service.UserService;
import com.spy.service.imp.UserServiceImpl;
import com.spy.util.page.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @RequestMapping(value = "/getUsers",method = RequestMethod.GET)
    @ResponseBody
    public List<User> getUsers(){
        return userService.list();
    }

    @RequestMapping(value = "/getUsersByPage",method = RequestMethod.GET)
    @ResponseBody
    public PageRet getUsersByPage(PageUtil pageUtil){
        PageRet userList = userService.getUsersByPage(pageUtil);
        return userList;
    }

}
