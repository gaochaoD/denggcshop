package com.denggc3.controller;


import com.denggc3.model.User;
import com.denggc3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * @author denggc3
 */
@Controller
@RequestMapping(value = "user")
public class UserController {


    @Autowired
    private UserService userService;

    @RequestMapping(value = "/touserregister",method = RequestMethod.GET)
    public String touserregister() {

        return "userregister";
    }

    @RequestMapping(value = "/userregister",method = RequestMethod.POST)
    public void userregister(User user, Model model) {
        userService.userregister(user);
    }

    @RequestMapping(value = "/tologin",method = RequestMethod.GET)
    public String tologin() {
        return "login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(String account, String password, HttpServletRequest req) {
        User user = userService.findByUsername(account);

        if(user == null ){
            System.out.println("无此用户");
        }else{
            if (user.getPasswordencrypt().equals(password)){
                HttpSession session = req.getSession();
                session.setAttribute("user",user);
            }else{

                System.out.println("密码不对");
            }
        }
        return "list";
    }
}
