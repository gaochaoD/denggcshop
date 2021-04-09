package com.denggc3.model;

import lombok.Data;

/**
 * Created by youfan on 2018/6/8 0008.
 * 产品名称
 * @author denggc3
 */
@Data
public class ProductType {
    private int id;
    private String producttypename;
    private String producttypedescription;
    /**
     * 等级比如1,2,3 1是最大的分类
     */
    private String typegrade;
    /**
     * 如果是第一类别，父节点就为-1
     */
    private int parentid;

}
