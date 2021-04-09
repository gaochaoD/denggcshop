/*
package com.denggc3.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

*/
/**
 * <p>
 *
 * </p>
 *
 * @author denggc3
 * @since 2020-12-28
 *//*

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Ordermain implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    */
/**
     * 支付金额
     *//*

    private BigDecimal payamount;

    */
/**
     * 用户id
     *//*

    private Integer userid;

    */
/**
     * 创建时间
     *//*

    private Date createtime;

    */
/**
     * 支付时间
     *//*

    private Date paytime;

    */
/**
     * 支付状态,1未支付 2已支付 3已退款
     *//*

    private Integer paystatus;

    */
/**
     * 收货人地址
     *//*

    private String consigneeadress;

    */
/**
     * 收货人电话
     *//*

    private String consigneephone;

    */
/**
     * 收货人姓名
     *//*

    private String consigneename;

    */
/**
     * 交易流水号
     *//*

    private String tradenumber;

    */
/**
     * 支付类型
     *//*

    private Integer paytype;

    */
/**
     * 订单状态
     *//*

    private Integer orderstatus;


}
*/
