package com.etc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: Yuzhe Li
 * @Date: 2018/8/28 17:29
 * @Description:
 */
@Controller
@RequestMapping("/address")
public class AddressController {
    @GetMapping("/add.html")
    public String add(){ return "/user/addaddress";}
}
