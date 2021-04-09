package com.denggc3.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.denggc3.mapper.ProductDetailMapper;
import com.denggc3.mapper.ProductMapper;
import com.denggc3.model.Product;
import com.denggc3.model.ProductDetail;
import com.denggc3.service.IProductDetailService;
import com.denggc3.vo.ProductDetailVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * @author denggc3
 */
@Service
public class ProductDetailServiceImpl  extends ServiceImpl<ProductDetailMapper, ProductDetail> implements IProductDetailService{


    @Autowired
    private ProductDetailMapper productDetailMapper;


    @Override
    public int insertProduct(ProductDetailVo productDetailVo) {
        return productDetailMapper.insertProductDetail(productDetailVo);

    }

    @Override
    public List<ProductDetail> findproductdetailbyproductid(int proudctid) {
        return productDetailMapper.findproductdetailbyproductid(proudctid);
    }
}
