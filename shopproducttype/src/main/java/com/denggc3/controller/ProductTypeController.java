package com.denggc3.controller;


import com.denggc3.model.ProductType;
import com.denggc3.service.IProducttypeService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author denggc3
 * @since 2020-12-25
 */
@Controller
public class ProductTypeController {

    @Autowired
    private IProducttypeService producttypeService;


    @ApiOperation(value = "跳转添加产品类型的界面")
    @GetMapping(value = "/toadd")
    public String toaddproducttype(int id ,Model model){

        ProductType producttype=producttypeService.getById(id);
        model.addAttribute("producttype",producttype);
        return "producttypeadd";
    }

    @ApiOperation(value="添加产品类型接口")
    @PostMapping(value = "/add")
    public String addProductType(ProductType producttype,Model model){
        producttypeService.save(producttype);
        List<ProductType> list=producttypeService.list();
        model.addAttribute("producttypes",list);
        return "producttypelist";
    }


    @ApiOperation(value = "跳转更新产品类型界面")
    @GetMapping(value = "/toupdate")
    public String toupdateProductType(int id, Model model){
        ProductType producttype=producttypeService.getById(id);
        model.addAttribute("producttype",producttype);
        return "producttypeupdate";
    }

    @ApiOperation(value="更新产品类型接口")
    @PostMapping(value = "/update")
    public String  updateProductType(ProductType producttype,Model model){
        producttypeService.updateById(producttype);
        List<ProductType> list=producttypeService.list();
        model.addAttribute("producttypes",list);
        return "producttypelist";
    }

    @ApiOperation(value = "跳转产品类型列表界面")
    @GetMapping(value = "/list")
    public String getProductTypes(Model model){
        List<ProductType> list=producttypeService.list();
        model.addAttribute("producttypes",list);
        return "producttypelist";
    }

    @ApiOperation(value = "根据Id查看产品类型信息，并跳转产品类型详情界面")
    @GetMapping(value = "/get")
    public String getProductTypeById(int id,Model model){
        ProductType producttype=producttypeService.getById(id);
        model.addAttribute("producttype",producttype);
        return "producttypeinfo";
    }


    @ApiOperation(value = "删除用户,直接删除")
    @GetMapping(value = "/delete")
    public String deleteUserById(int id, Model model){
        producttypeService.removeById(id);
        List<ProductType> list=producttypeService.list();
        model.addAttribute("producttypes",list);
        return "producttypelist";
    }


    @RequestMapping(value = "/getlist",method = RequestMethod.POST)
    @ResponseBody
    public List<ProductType> getProductTypeList() {
        List<ProductType> list = producttypeService.list();
        return list;
    }

}

