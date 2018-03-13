package com.example.demo.controller;

import com.example.demo.model.User.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Created by a on 2018/3/13.
 */
@Controller
public class IndexController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public  String index(){
        List<User> users= userService.getList();
        System.out.println("size："+users.size());
        return "index.html";
    }
}
