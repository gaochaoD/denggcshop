package com.denggc3.controller;

import com.denggc3.model.Product;
import com.denggc3.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;
import java.util.List;

/**
 * @author denggc3
 */

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping(value = "/list")
    @ResponseBody
    public List select(Model model){

        List<Product> list=productService.getProductTypeList();
        model.addAttribute("produclist",list);
        return list;
    }


}
