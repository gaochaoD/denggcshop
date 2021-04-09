package com.denggc3.service;


import com.denggc3.vo.OrderInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author denggc3
 */
@FeignClient(value = "ORDER")
public interface OrderService {

    /**
     * 插入 内部调用
     * @param orderInfo
     */
    @RequestMapping(value = "/orderout/insert",method = RequestMethod.POST)
    public void insertOrder(@RequestBody OrderInfo orderInfo);


}
