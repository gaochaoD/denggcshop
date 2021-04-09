/*
package com.denggc3.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
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
 * @since 2020-12-30
 *//*

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Orderdetail implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    */
/**
     * 订单id
     *//*

    private Integer orderid;

    */
/**
     * 商品id
     *//*

    private Integer productid;

    */
/**
     * 商家id
     *//*

    private Integer mechartid;

    */
/**
     * 创建时间
     *//*

    private LocalDateTime createtime;

    */
/**
     * 交易数量
     *//*

    private Integer tradenum;


}
*/
