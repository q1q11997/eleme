package com.etc.service;

import com.etc.dao.UserMapper;
import com.etc.entity.User;
import com.etc.entity.UserExample;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Yuzhe Li on 2018/8/23.
 */
@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    /**
     * 添加新的用户
     * @param user
     * @return 执行成功的sql语句条数 若为1则执行成功。
     */
    public boolean add(User user){
        int row = userMapper.insert(user);
        return row>0;
    }


    /**
     * 通过用户主键删除用户数据
     * @param uid
     * @return 执行成功的sql语句条数 若为1则执行成功。
     */
    public boolean delete(int uid){
        int row = userMapper.deleteByPrimaryKey(uid);
        return row>0;
    }

    /**
     * 通过用户主键更新用户数据，为空的字段会被设为null。
     * 请先获取该用户所有信息然后再更改
     * @param user
     * @return 执行成功的sql语句条数 若为1则执行成功。
     */
    public boolean update(User user){
        int row = userMapper.updateByPrimaryKey(user);
        return row>0;
    }

    /**
     * 通过用户主键查询单个用户的信息
     * @param uid
     * @return user 用户信息
     */
    public User findById(int uid){
        User user = userMapper.selectByPrimaryKey(uid);
        return user;
    }

    /**
     * 查询所有用户的信息
     * @return userList  用户信息列表
     */
    public List<User> findAll(){
        List<User> userList = userMapper.selectByExample(null);
        return userList;
    }

    public Map<String,String> validateUserName(String username){
        Map<String,String> isValidate = new HashMap<>();
        isValidate.put("error","用户名长度过短，应大于6位");
        if (username.length()>=6){
            isValidate.put("error","用户名长度过长，应小于16位");
            if (username.length()<=16){
                isValidate.put("error","用户名已存在请重新输入");
                UserExample ue = new UserExample();
                ue.createCriteria().andUnameEqualTo(username);
                if(userMapper.selectByExample(ue).size() == 0){
                    isValidate.remove("error");
                    isValidate.put("success","验证成功");
                }
            }
        }
        return isValidate;
    }

    public Map<String,String> validateUserPassword(String username,String password){
        Map<String,String> isValidate = new HashMap<>();
        isValidate.put("error","密码长度过短，应大于6位");
        if (password.length()>=6){
            isValidate.put("error","密码长度过长，应小于16位");
            if (password.length()<=16){
                isValidate.put("error","密码不能与用户名相同");
                if(!username.equals(password)){
                    isValidate.remove("error");
                    isValidate.put("success","验证成功");
                }
            }
        }
        return isValidate;
    }
 }
