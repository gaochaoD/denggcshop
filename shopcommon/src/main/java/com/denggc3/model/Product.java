package com.denggc3.model;

import lombok.Data;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Administrator on 2018/6/18 0018.
 * 商品信息
 * @author denggc3
 */
@Data
public class Product{
    /**
     * 主键
     */
    private int id;
    /**
     * 商品类别
     */
    private int producttypeid;
    /**
     * 商品标题
     */
    private String producttitle;
    /**
     * 商品价格
     */
    private BigDecimal productprice;
    /**
     * 商家id
     */
    private int mechartid;
    /**
     * 创建时间
     */
    private Date createtime;
    /**
     * 审核时间
     */
    private Date audittime;
    /**
     * 审核转态,0,未审核 1 审核通过 2 审核不通过
     */
    private int auditstate;
    /**
     * 库存
     */
    private int stocknum;
    /**
     * 销售数量
     */
    private int sellnum;
    /**
     * 商品图片地址
     */
    private String productpicurl;
    /**
     * 产品状态，0代表上架，1代表下架
     */
    private int proudctstatus;

}
