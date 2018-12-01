package com.spy.service.imp;

import com.spy.dao.UserMapper;
import com.spy.entity.User;
import com.spy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSericeImp implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUsers() {
        return userMapper.selectUsers();
    }
}
