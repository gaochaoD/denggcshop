package com.denggc3.controller;


import com.denggc3.model.Product;
import com.denggc3.model.ProductType;
import com.denggc3.service.ProductService;
import com.denggc3.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
/**
 * @author denggc3
 */
@Controller
@RequestMapping(value = "/home")
public class HomeController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductTypeService productTypeService;


    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String sayHi(Model model, @RequestParam int productytpeid) {
        List<ProductType> list = productTypeService.getProductTypeList();
        model.addAttribute("productypelist", list);
        System.out.println(list);
        if (productytpeid == -1) {
            productytpeid = list.get(0).getId();
        }
        List<Product> productlist = productService.getProductByCondition(productytpeid);
        model.addAttribute("produclist", productlist);
        return "list";
    }
}
