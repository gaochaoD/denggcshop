package com.denggc3.service;


import java.math.BigDecimal;
/**
 * @author denggc3
 */
public interface IPayService {

    /**
     * 支付
     * @param keyNumber
     * @param money
     * @return
     */
    int payforAmount(int keyNumber, BigDecimal money);
}
