package com.denggc3.controller;


import com.denggc3.model.Product;
import com.denggc3.service.IProductService;
import com.denggc3.vo.ConstomProduct;
import com.denggc3.vo.ProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/7/22 0022.
 * @author denggc3
 */
@RestController
@RequestMapping(value = "productOut")
public class ProductOutController {
    @Autowired
    private IProductService productService;


    @RequestMapping(value = "/listproductout",method = RequestMethod.GET)
    public List<Product> listproductout(@RequestParam int proudcttypeid){
        ProductVo productvo = new ProductVo();
        productvo.setProducttypeid(proudcttypeid);
        List<Product> list = productService.queryProductbyvo(productvo);
        return list;
    }

    @RequestMapping(value = "/insertoutProduct",method = RequestMethod.POST)
    public void insertProduct(@RequestBody Product product){
        product.setCreatetime(new Date());
        product.setSellnum(0);
        product.setProudctstatus(0);
        productService.save(product);
    }

    @RequestMapping(value = "/viewoutProduct",method = RequestMethod.GET)
    public Product viewProduct(int id){
        Product product = productService.getById(id);
        return product ;
    }

    @RequestMapping(value = "/deleteoutProduct",method = RequestMethod.GET)
    public void deleteProduct(int id){
        productService.removeById(id);
    }

    @RequestMapping(value = "/updateoutProduct",method = RequestMethod.POST)
    public void updateProduct(@RequestBody Product product){
        productService.updateById(product);
    }


/*    @RequestMapping(value = "/searchproductout",method = RequestMethod.GET)
    public List<Product> searchproductout(@RequestParam String keyword){
        List<Product> list = productService.queryProductbyids(keyword);
        return list;
    }*/

}
