package com.denggc3.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.denggc3.model.Order;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author denggc3
 * @since 2020-12-28
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

}
