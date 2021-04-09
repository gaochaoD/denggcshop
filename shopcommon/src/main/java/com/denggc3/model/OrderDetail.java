package com.denggc3.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * Created by Administrator on 2018/6/23 0023.
 * @author denggc3
 */
@Data
@TableName(value = "orderdetail")
public class OrderDetail {
    /**
     * 主键
     */
    private int id;
    /**
     * 订单id
     */
    private int orderid;
    /**
     * 商品id
     */
    private int productid;
    /**
     * 商家id
     */
    private int mechartid;
    /**
     * 创建时间
     */
    private Date createtime;
    /**
     * 交易数量
     */
    private int  tradenum;

}
