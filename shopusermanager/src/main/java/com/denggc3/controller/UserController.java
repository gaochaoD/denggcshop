package com.denggc3.controller;


import com.denggc3.model.User;
import com.denggc3.service.IUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author denggc3
 * @since 2020-12-24
 */

@ApiOperation(value = "用户管理模块")
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private IUserService userService;


    @ApiOperation(value = "跳转用户注册界面")
    @GetMapping(value = "/touserregister")
    public String touserregister(){
        return "producttypelist";
    }

    @ApiOperation(value="用户注册接口")
    @PostMapping(value = "/userregister")
    @ResponseBody
    public String addUser(User user){
        userService.save(user);
        return "注册成功";
    }

    @ApiOperation(value = "跳转更新用户信息界面")
    @GetMapping(value = "/toupdateuser")
    public String toupdateuser(int userId, Model model){
        User user=userService.getById(userId);
        model.addAttribute("user",user);
        return "userupdate";
    }

    @ApiOperation(value="更新用户信息接口")
    @PostMapping(value = "/update")
    public String  updateUser(User user,Model model){
        userService.updateById(user);
        List<User> list=userService.list();
        model.addAttribute("users",list);
        return "userlist";
    }

    @ApiOperation(value = "跳转用户列表界面")
    @GetMapping(value = "/list")
    public String getUserList(Model model){
        List<User> list=userService.list();
        model.addAttribute("users",list);
        return "userlist";
    }

    @ApiOperation(value = "根据Id查看用户信息，并跳转用户详情界面")
    @GetMapping(value = "/get")
    public String getUserById(int userId,Model model){
        User user=userService.getById(userId);
        model.addAttribute("user",user);
        return "userinfo";
    }

/*    @ApiOperation(value="根据UserId获取用户信息")
    @PostMapping(value = "/selectById")
    public User selectUserById(int userId){
        return userService.getById(userId);
    }*/


    @ApiOperation(value = "删除用户,直接删除")
    @GetMapping(value = "/delete")
    public String deleteUserById(int userId, Model model){
        userService.removeById(userId);
        List<User> list=userService.list();
        model.addAttribute("users",list);
        return "userlist";
    }
}

