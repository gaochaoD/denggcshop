package com.denggc3.vo;


import com.denggc3.model.Order;
import com.denggc3.model.OrderDetail;
import lombok.Data;

/**
 * @author denggc3
 */
@Data
public class OrderInfo {

    private Order order;

    private OrderDetail orderDetail;
}
