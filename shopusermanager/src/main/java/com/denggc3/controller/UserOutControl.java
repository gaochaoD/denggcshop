package com.denggc3.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.denggc3.model.User;
import com.denggc3.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by youfan on 2018/6/6 0006.
 * @author denggc3
 */
@RestController
@RequestMapping(value = "/userout")
public class UserOutControl {

    @Autowired
    private IUserService userServive;

    @RequestMapping(value = "/listoutUser",method = RequestMethod.GET)
    @ResponseBody
    public List<User> listoutUser() {
        List<User> listuser = userServive.list();
        return listuser;
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public void userregister(@RequestBody  User user) {
        userServive.save(user);
        return;
    }

    @RequestMapping(value = "/findByUsername",method = RequestMethod.POST)
    public User findByUsername(@RequestParam(value = "userName") String  userName){
        QueryWrapper queryWrapper=new QueryWrapper();
        queryWrapper.eq("name",userName);
        User user=userServive.getOne(queryWrapper);
        return user;
    }
}
