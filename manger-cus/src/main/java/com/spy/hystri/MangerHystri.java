package com.spy.hystri;

import com.spy.entity.User;
import com.spy.service.MangerService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MangerHystri implements MangerService {
    @Override
    public List<User> getUsers() {
        List<User> list = new ArrayList<>();
        User user = new User();
        user.setName("发生错误");
        list.add(user);
        return list;
    }
}
