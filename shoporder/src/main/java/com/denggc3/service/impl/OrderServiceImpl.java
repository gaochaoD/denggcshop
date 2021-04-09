package com.denggc3.service.impl;

import com.denggc3.mapper.OrderMapper;
import com.denggc3.model.Order;
import com.denggc3.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author denggc3
 * @since 2020-12-28
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}
