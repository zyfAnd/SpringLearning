package com.zhangyanfu.controller;

import com.zhangyanfu.entity.User;
import com.zhangyanfu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author Zhang Yanfu
 * @Date 2017/12/25.
 * @Email 1105564280@qq.com
 */
@RestController
public class IndexController {
    @Autowired
    UserService service;
    @RequestMapping(path = "/home")
    public List<User> index(){
        System.out.println("entry indexController");
        List<User> users = service.getUsers();
        System.out.println("controller -users -- "+users);

        return users;
    }
}
