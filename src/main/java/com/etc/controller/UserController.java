package com.etc.controller;


import com.etc.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by Yuzhe Li on 2018/8/23.
 */
@Controller
@RequestMapping("/users")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/detail.html")
    public String detail(){ return "user/userdetail";}

    @GetMapping("/orders.html")
    public String orders(){ return "user/userorders";}

    @GetMapping("/address.html")
    public String address(){ return "user/useraddress";}

}
