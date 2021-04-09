package com.denggc3.service;


import com.denggc3.model.ProductType;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
/**
 * @author denggc3
 */
@FeignClient(value = "PRODUCTTYPE")
public interface ProductTypeService {

    /**
     * 查询list
     * @return
     */
    @RequestMapping(value = "/getlist",method = RequestMethod.POST)
    List<ProductType> getProductTypeList();


}
