package com.denggc3.vo;


import com.denggc3.model.ProductDetail;
import lombok.Data;
/**
 * @author denggc3
 */
@Data
public class ProductDetailVo extends ProductDetail {

    private int pageNo;

    private int pageSize;

}
