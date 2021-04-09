package com.denggc3.service;


import com.denggc3.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
/**
 * @author denggc3
 */
@FeignClient(value = "UserServe")
public interface UserService {


    /**
     * 注册
     * @param user
     */
    @RequestMapping(value = "userout/register",method = RequestMethod.POST)
    public void userregister(User user);

    /**
     * 查询用户 内部
     * @param userName
     * @return
     */
    @RequestMapping(value = "userout/findByUsername",method = RequestMethod.POST)
    public User findByUsername(@RequestParam(value = "userName") String userName);


}
