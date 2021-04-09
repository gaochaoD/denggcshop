package com.denggc3.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Administrator on 2018/6/23 0023.
 * @author denggc3
 */
@Data
@TableName(value = "ordermain")
public class Order {
    /**
     * 主键
     */
    private int id;
    /**
     * 支付金额
     */
    private BigDecimal payamount;
    /**
     * 用户id
     */
    private int userid;
    /**
     * 创建时间
     */
    private Date createtime;
    /**
     * 支付时间
     */
    private Date paytime;
    /**
     * 支付状态 支付状态,1未支付 2已支付 3已退款
     */
    private int paystatus;
    /**
     * 收货人地址
     */
    private String consigneeadress;
    /**
     * 收货人电话
     */
    private String consigneephone;
    /**
     * 收货人姓名
     */
    private String consigneename;
    /**
     * 交易流水号
     */
    private String tradenumber;
    /**
     * 支付类型
     */
    private int paytype;
    /**
     * 订单状态 0 正常，1 取消
     */
    private int orderstatus;

}
