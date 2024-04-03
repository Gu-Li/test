package com.example.demo2.service;

import com.example.demo2.mapper.UserMapper;
import com.example.demo2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestService {
    @Autowired
    private UserMapper userMapper;

    public List<User> getList() {
        System.out.println(("----- selectAll method test ------"));
        return userMapper.selectList(null);
    }
}
