package com.denggc3.controller;


import com.denggc3.enums.PayEnum;
import com.denggc3.service.impl.AliPayServiceImpl;
import com.denggc3.service.impl.UnionPayServiceImpl;
import com.denggc3.service.impl.WechatPayServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.websocket.server.ServerEndpoint;
import java.math.BigDecimal;

/**
 * @author denggc3
 */
@Controller
@RequestMapping(value = "pay")
public class PayforController {

    @Autowired
    private AliPayServiceImpl aliPayService;

    @Autowired
    private UnionPayServiceImpl unionPayService;

    @Autowired
    private WechatPayServiceImpl wechatPayService;


    @ApiOperation(value = "支付")
    @PostMapping(value = "method")
    public int pay(String payMethod, int keyNumber, BigDecimal money){

        return 0;
    }

    /**
     *
     * @param paytype 1 微信支付 2 支付宝支付 3 银联卡支付
     * @param keyNumber
     * @param amount
     * @return 1支付成功 2支付失败
     */
    @RequestMapping(value = "payWithAmout")
    public int payWithAmout(String paytype,int keyNumber,BigDecimal amount){
        int payresult = 2;
        if(PayEnum.WECHAT_PAY.getCode().equals(paytype)){
            payresult = wechatPayService.payforAmount(keyNumber,amount);
        }else if(PayEnum.UNION_PAY.getCode().equals(paytype)){
            payresult = unionPayService.payforAmount(keyNumber,amount);
        }else if(PayEnum.ALI_PAY.getCode().equals(paytype)){
            payresult =aliPayService.payforAmount(keyNumber,amount);
        }
        return payresult;
    }
}
