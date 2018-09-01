package com.etc.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.etc.entity.User;
import com.etc.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Yuzhe Li on 2018/8/23.
 */
@RestController
@RequestMapping("**.do")
public class UserRestController {

    @Resource
    private UserService userService;

    @GetMapping("/users")
    public String getAllUser(){
        List<User> userList = userService.findAll();
        String jsonString = JSONArray.toJSONString(userList);
        JSONArray jsonArray = JSONArray.parseArray(jsonString);
        return jsonArray.toJSONString();
    }

    @GetMapping("/users/{uid}")
    public String getUserById(@PathVariable int uid){
        User user = userService.findById(uid);
        String json_user = JSONObject.toJSONString(user);
        return json_user;
    }

}
