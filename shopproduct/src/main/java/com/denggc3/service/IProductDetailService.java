package com.denggc3.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.denggc3.model.Product;
import com.denggc3.model.ProductDetail;
import com.denggc3.vo.ProductDetailVo;

import java.util.List;

/**
 * @author denggc3
 */
public interface IProductDetailService extends IService<ProductDetail> {

     /**
      * 查找
      * @param productDetailVo
      * @return
      */
     int insertProduct(ProductDetailVo productDetailVo);

     /**
      * 根据 主键 查找
      * @param proudctid
      * @return
      */
     List<ProductDetail> findproductdetailbyproductid(int proudctid);
}
