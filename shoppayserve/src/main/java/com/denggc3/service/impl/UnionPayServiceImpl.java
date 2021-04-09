package com.denggc3.service.impl;


import com.denggc3.service.IPayService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
/**
 * @author denggc3
 */
@Service("union")
public class UnionPayServiceImpl implements IPayService {
    @Override
    public int payforAmount(int keyNumber, BigDecimal money) {
        System.out.println("银联");
        return 0;
    }
}
