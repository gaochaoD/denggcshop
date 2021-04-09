package com.denggc3.controller;

import com.denggc3.model.Order;
import com.denggc3.model.OrderDetail;
import com.denggc3.service.IOrderService;

import com.denggc3.service.IOrderdetailService;
import com.denggc3.vo.OrderInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/6/23 0023.
 * @author denggc3
 */
@RestController
@RequestMapping(value = "/orderout")
public class OrderOutController {

    @Autowired
    private IOrderService orderService;

    @Autowired
    private IOrderdetailService orderDetailService;

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public void insertOrder(@RequestBody OrderInfo orderInfo){
        Order order = orderInfo.getOrder();
        OrderDetail orderDetail = orderInfo.getOrderDetail();
        orderService.save(order);
        orderDetail.setCreatetime(order.getCreatetime());
        orderDetail.setOrderid(order.getId());
        orderDetailService.save(orderDetail);
    }


}
