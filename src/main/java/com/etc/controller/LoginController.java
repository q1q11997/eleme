package com.etc.controller;

import com.etc.dao.UserMapper;
import com.etc.entity.User;
import com.etc.entity.UserExample;
import com.etc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Created by Yuzhe Li on 2018/8/23.
 */
@Controller
public class LoginController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;
    /**
     * GET请求
     * 转到主页index.html
     * @return index.html
     */
    @GetMapping({"/index.html","/"})
    public String index(){
        return "index";
    }

    /**
     * GET请求
     * 转到用户登录界面 位于 templates/login/login.html
     * @return login.html
     */
    @GetMapping("/login.html")
    public String loginIndex(){
        return "/login/login";
    }

    /**
     * POST请求
     * 接收由用户账号密码封装成的对象User，判断账号密码是否正确。
     * 若正确则在Session中保存该用户信息对象user,然后重定向至首页。
     * 若错误则提示错误信息，回到登录界面。
     * @param user
     * @param request
     * @return index.html 或 login.html
     */
    @PostMapping("/login.html")
    public String login(User user, HttpServletRequest request){
        //判断填入的信息是否为空
        if(user.getUname()!= null && user.getPassword()!= null){
            UserExample ue = new UserExample();
            ue.createCriteria().andPasswordEqualTo(user.getPassword()).andUnameEqualTo(user.getUname());
            List<User> userList = userMapper.selectByExample(ue);
            //若userList的长度等于1且该用户的账号密码与输入相同则说明登录成功
            if(userList.size() == 1 && userList.get(0).getUname().equals(user.getUname()) && userList.get(0).getPassword().equals(user.getPassword())){
                request.getSession().setAttribute("user",userList.get(0));
                return "redirect:index.html";
            }
            else
                request.setAttribute("loginMsg","账号或密码错误 请重新输入！");
        }
        else
            request.setAttribute("loginMsg","账号或密码为空 请重新输入！");
        return "/login/login";
    }

    /**
     * GET请求
     * 用户登出操作，清除Session中存储的所有信息，并设置在logout.html中的提示信息后最终返回到主页。
     * 位于 templates/login/logout.html
     * @param request
     * @return logout.html
     */
    @GetMapping("/logout")
    public String logout(HttpServletRequest request){
        request.getSession().invalidate();
        request.setAttribute("logoutMsg", "您已安全退出系统");
        return "/login/logout";
    }

    /**
     * GET请求
     * 转到用户注册界面 位于 templates/login/register.html
     * @param user
     * @return register.html
     */
    @GetMapping("/register.html")
    public String registerIndex(){ return "login/register";}

    @PostMapping("/register.html")
    public String register(User user,HttpServletRequest request){
        request.removeAttribute("nameErrorMsg");
        request.removeAttribute("passwordErrorMsg");
        Map<String,String> nameMap = userService.validateUserName(user.getUname());
        Map<String,String> passwordMap = userService.validateUserPassword(user.getUname(),user.getPassword());
        if(nameMap.containsKey("success")&& passwordMap.containsKey("success")){
            //添加用户到数据库
            userService.add(user);
            UserExample ue = new UserExample();
            ue.createCriteria().andUnameEqualTo(user.getUname()).andPasswordEqualTo(user.getPassword());
            user = userMapper.selectByExample(ue).get(0);
            //保持登录状态
            request.getSession().setAttribute("user",user);
            return "redirect:index.html";
        }
        request.setAttribute("nameErrorMsg",nameMap.get("error"));
        request.setAttribute("passwordErrorMsg",passwordMap.get("error"));
        return "login/register";
    }
}
