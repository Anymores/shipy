package com.spy.hystri;

import com.spy.entity.User;
import com.spy.service.MangerService;
import org.springframework.stereotype.Component;

@Component
public class MangerHystri implements MangerService {
    @Override
    public User getUsers() {
        User user = new User();
        user.setName("发生错误");
        return user;
    }
}
