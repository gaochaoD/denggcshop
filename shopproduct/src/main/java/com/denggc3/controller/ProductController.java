package com.denggc3.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.denggc3.model.Product;
import com.denggc3.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author denggc3
 * @since 2020-12-28
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService productService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String  insertProduct(Product product, Model model){
        product.setCreatetime(new Date());
        product.setSellnum(0);
        product.setProudctstatus(0);
        productService.save(product);
        List<Product> list = productService.list();
        model.addAttribute("list",list);
        return "listproduct";
    }

    @RequestMapping(value = "/toadd",method = RequestMethod.GET)
    public String toinsertProduct(Product product){
        return "addproduct";
    }

    @RequestMapping(value = "/toAudit",method = RequestMethod.GET)
    public String toAuditProduct(int id, Model model){
        Product product = productService.getById(id);
        model.addAttribute("product",product);
        return "auditproduct";
    }

    @RequestMapping(value = "/audit",method = RequestMethod.POST)
    public void auditProduct(Product product){
        productService.updateById(product);
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String listProduct(Model model){
        List<Product> list = productService.list();
        model.addAttribute("list",list);
        return "listproduct";
    }


    @RequestMapping(value = "/view",method = RequestMethod.GET)
    public String viewProduct(int id,Model model){
        Product product = productService.getById(id);
        model.addAttribute("product",product);
        return "viewproduct";
    }


    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public String deleteProduct(int id,Model model){
        productService.removeById(id);
        List<Product> list=productService.list();
        model.addAttribute("list",list);
        return "listproduct";
    }

    @RequestMapping(value = "/toupdate",method = RequestMethod.GET)
    public String toupdateProduct(int id,Model model){
        Product product = productService.getById(id);
        model.addAttribute("product",product);
        return "updateproduct";
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String updateProduct(Product product, Model model){
        productService.updateById(product);
        List<Product> list=productService.list();
        model.addAttribute("list",list);
        return "listproduct";
    }

    @RequestMapping(value = "/updateStatus",method = RequestMethod.GET)
    public String upateProductbyproductstatus(int id, int productstatus, Model model){
        Product product=new Product();
        product.setId(id);
        product.setProudctstatus(productstatus);
        productService.updateById(product);
        List<Product> list=productService.list();
        model.addAttribute("list",list);
        return "listproduct";
    }


    @RequestMapping(value = "/getProductByCondition",method = RequestMethod.POST)
    @ResponseBody
    public List<Product> getProductByCondition(@RequestParam(value = "productTypeId") int productTypeId){
        System.out.println("进入产品服务");
        QueryWrapper queryWrapper=new QueryWrapper();
        queryWrapper.eq("producttypeid",productTypeId);
        List<Product> list=productService.list(queryWrapper);
        return list;
    }

    @RequestMapping(value = "/searchproductout",method = RequestMethod.GET)
    public List<Product> searchproductout(@RequestParam String keyword){
        List<Product> list = productService.list();
        return list;
    }

}

