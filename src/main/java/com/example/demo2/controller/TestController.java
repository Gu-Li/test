package com.example.demo2.controller;

import com.example.demo2.model.User;
import com.example.demo2.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("/getList")
    public List<User> getList(){
        return testService.getList();
    }
}
