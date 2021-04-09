package com.denggc3.service.impl;


import com.denggc3.service.IPayService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
/**
 * @author denggc3
 */
@Service("wechat")
public class WechatPayServiceImpl implements IPayService {
    @Override
    public int payforAmount(int keyNumber, BigDecimal money) {
        System.out.println("微信");
        return 0;
    }
}
