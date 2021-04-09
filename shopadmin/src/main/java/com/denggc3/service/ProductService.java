package com.denggc3.service;


import com.denggc3.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
/**
 * @author denggc3
 */
@FeignClient(value = "ProductServe")
public interface ProductService {

    /**
     * list 查询
     * @param producttyeid
     * @return
     */
    @RequestMapping(value = "/listproductout",method = RequestMethod.GET)
    List<Product> listproduct(@RequestParam(value = "proudcttypeid") int producttyeid);

    /**
     * 插入
     * @param product
     */
    @RequestMapping(value = "/insertoutProduct",method = RequestMethod.POST)
    public void insertProduct(@RequestBody Product product);

    /**
     * 产品展示
     * @param id
     * @return
     */
    @RequestMapping(value = "/viewoutProduct",method = RequestMethod.GET)
    public Product viewProduct(@RequestParam(value = "id") int id);

    /**
     * 删除
     * @param id
     */
    @RequestMapping(value = "/deleteoutProduct",method = RequestMethod.GET)
    public void deleteProduct(@RequestParam(value = "id") int id);

    /**
     * 更新
     * @param product
     */
    @RequestMapping(value = "/updateoutProduct",method = RequestMethod.POST)
    public void updateProduct(@RequestBody Product product);
}
