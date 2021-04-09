package com.denggc3.controller;


import com.denggc3.model.ProductDetail;
import com.denggc3.service.IProductDetailService;
import com.denggc3.vo.ProductDetailVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * @author denggc3
 */
@RestController
@RequestMapping(value = "productDelOut")
public class ProductDetailOutController {

    @Autowired
    private IProductDetailService productDetailService;

    @RequestMapping(value = "/insertProductoutDetail",method = RequestMethod.POST)
    public void insertProduct(@RequestBody ProductDetailVo productDetailVo){
//        productDetailService.save(productDetailVo);
        productDetailService.insertProduct(productDetailVo);
    }

    @RequestMapping(value = "/findproductdetailbyproductid",method = RequestMethod.POST)
    public List<ProductDetail> findproductdetailbyproductid(@RequestParam int proudctid){
        return productDetailService.findproductdetailbyproductid(proudctid);
    }

}
