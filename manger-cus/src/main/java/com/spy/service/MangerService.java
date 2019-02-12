package com.spy.service;

import com.spy.entity.User;
import com.spy.hystri.MangerHystri;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "product-cus",fallback = MangerHystri.class)
public interface MangerService {

    @RequestMapping(value = "/getUsers",method = RequestMethod.GET)
    List<User> getUsers();
}
