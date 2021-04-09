package com.denggc3.service;


import com.denggc3.model.Product;
import com.denggc3.model.ProductDetail;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
/**
 * @author denggc3
 */
@FeignClient(value = "PRODUCT")
public interface ProductService {

    /**
     * list 内部调用
     * @return
     */
    @PostMapping(value = "/list")
    List<Product>  getProductTypeList();


    /**
     * 查询 内部调用
     * @param productTypeId
     * @return
     */
    @PostMapping(value = "/product/getProductByCondition")
    List<Product> getProductByCondition(@RequestParam(value = "productTypeId") int productTypeId);

    /**
     * 查询 内部调用
     * @param keyword
     * @return
     */
    @RequestMapping(value = "/searchproductout",method = RequestMethod.GET)
    public List<Product> searchproductout(@RequestParam(value = "keyword") String keyword);

    /**
     * 内部调用
     * @param proudctid
     * @return
     */
    @RequestMapping(value = "/findproductdetailbyproductid",method = RequestMethod.POST)
    public ProductDetail findproductdetailbyproductid(@RequestParam(value = "proudctid") int proudctid);

    /**
     * 根据Id 查询
     * @param id
     * @return
     */
    @RequestMapping(value = "/viewoutProduct",method = RequestMethod.GET)
    public Product viewProduct(@RequestParam(value = "id") int id);


}
