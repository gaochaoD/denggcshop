package com.denggc3.controller;


import com.denggc3.config.threadpool.AsycTask;
import com.denggc3.model.Order;
import com.denggc3.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author denggc3
 * @since 2020-12-28
 */
@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private IOrderService orderService;

    @Autowired
    private AsycTask asycTask;

    @RequestMapping(value = "/toadd",method = RequestMethod.GET)
    public String toinsertOrder(){
        return "insertorder";
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    public String listOrder( Model model){
        List<Order> list = orderService.list();
        model.addAttribute("orderlist",list);
//        AsycTask asycTask=new AsycTask();
        asycTask.method1();
        asycTask.method2();
        System.out.println("当前线程:"+Thread.currentThread().getName());
        return "listorder";
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public void insertOrder(Order order){
        orderService.save(order);
    }

    @RequestMapping(value = "/toupdate",method = RequestMethod.GET)
    public String toupdateOrderInfo(Model model,int id){
        Order order = orderService.getById(id);
        model.addAttribute("order",order);
        return "updateorder";
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ResponseBody
    public void updateOrderInfo(int id,String consigneeadress,String consigneephone,String consigneename){

        Order order=new Order();
        order.setId(id);
        order.setConsigneeadress(consigneeadress);
        order.setConsigneephone(consigneephone);
        order.setConsigneename(consigneename);
        orderService.updateById(order);
    }

    @RequestMapping(value = "/toview",method = RequestMethod.GET)
    public String toinsertOrder(Model model,int id){
        Order order = orderService.getById(id);
        model.addAttribute("order",order);
        return "vieworder";
    }


    @RequestMapping(value = "/toupdatemechart",method = RequestMethod.GET)
    public String toupdateOrderInfoWithMechart(Model model,int id){
        Order order = orderService.getById(id);
        model.addAttribute("order",order);
        return "updateordermechart";
    }

    @RequestMapping(value = "/updateOrder",method = RequestMethod.POST)
    @ResponseBody
    public void updateOrderInfoWithMechart(int id,String consigneeadress,String consigneephone,String consigneename){
        Order order=new Order();
        order.setId(id);
        order.setConsigneeadress(consigneeadress);
        order.setConsigneephone(consigneephone);
        order.setConsigneename(consigneename);
        orderService.updateById(order);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    @ResponseBody
    public void deleteorderbyid(int id){
        orderService.removeById(id);
    }

}

