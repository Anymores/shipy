package com.spy.controller;

import com.spy.entity.User;
import com.spy.service.MangerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MangerController {

    @Autowired
    MangerService mangerService;


    @RequestMapping(value = "/getUsers",method = RequestMethod.GET)
    @ResponseBody
    public List<User> getUsers(){
        return mangerService.getUsers();
    }

}
