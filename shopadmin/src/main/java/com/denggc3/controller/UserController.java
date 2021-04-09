package com.denggc3.controller;

import com.denggc3.model.User;
import com.denggc3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Administrator on 2018/7/29 0029.
 * @author denggc3
 */
@Controller
@RequestMapping(value = "admin")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/userlist",method = RequestMethod.GET)
    public String listuser(Model model){
        List<User> listuser = userService.listoutUser();
        model.addAttribute("userlist",listuser);
        return "userlist";
    }


}
