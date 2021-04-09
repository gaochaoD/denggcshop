package com.denggc3.service;

import com.denggc3.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Administrator on 2018/7/29 0029.
 * @author denggc3
 */
@FeignClient(value = "UserServe")
public interface UserService {

    /**
     * 用户列表 内部查询
     * @return
     */
    @RequestMapping(value = "/userout/listoutUser",method = RequestMethod.GET)
    public List<User> listoutUser();

}
