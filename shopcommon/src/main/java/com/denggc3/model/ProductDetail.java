package com.denggc3.model;

import lombok.Data;

/**
 * Created by Administrator on 2018/6/18 0018.
 * 商品详情信息
 * @author denggc3
 */
@Data
public class ProductDetail {
    /**
     * 主键
     */
    private int id;
    /**
     * 商品id
     */
    private int proudctid;
    /**
     * 商品产地
     */
    private String productplace;
    /**
     * 商品描述
     */
    private String productdescription;
    /**
     * 商品品牌
     */
    private String productbrand;
    /**
     * 商品重量
     */
    private String productweight;
    /**
     * 商品规格说明和包装
     */
    private String productspecification;
    /**
     * 商品详情图片地址
     */
    private String productdetaipicurl;


}
