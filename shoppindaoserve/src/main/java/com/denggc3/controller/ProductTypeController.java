package com.denggc3.controller;

import com.denggc3.model.ProductType;
import com.denggc3.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * @author denggc3
 */

@RestController

public class ProductTypeController {

    @Autowired
    private ProductTypeService productTypeService;

    @GetMapping(value = "/list")
    @ResponseBody
    public List select(Model model){

        List<ProductType> list=productTypeService.getProductTypeList();
//        model.addAttribute("produclist",list);
        return list;
    }


}
