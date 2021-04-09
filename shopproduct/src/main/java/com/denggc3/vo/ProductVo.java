package com.denggc3.vo;

import com.denggc3.model.Product;
import lombok.Data;


/**
 * Vo代表值对象的意思，通常用于业务层之间的数据传递，由new创建，由GC回收。
 * @author denggc3
 */


@Data
public class ProductVo extends Product {


    private int pageNo;

    private int pageSize;


}
