package com.denggc3.controller;


import com.denggc3.entity.Mechant;
import com.denggc3.service.IMechantService;
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
@RequestMapping(value = "/mechant")
public class MechantController {

    @Autowired
    private IMechantService mechantService;


    @ApiOperation(value = "跳转商家入驻界面")
    @GetMapping(value = "/toadd")
    public String toaddmechant(){
        return "mechantadd";
    }

    @ApiOperation(value="添加商家接口")
    @PostMapping(value = "/add")
    public String addMechant(Mechant mechant,Model model){
        mechant.setAuditstatus(1);
        mechant.setSoldout(1);
        mechantService.save(mechant);
        List<Mechant> list=mechantService.list();
        model.addAttribute("mechants",list);
        return "mechantlist";
    }


    @ApiOperation(value = "跳转更新商家界面")
    @GetMapping(value = "/toupdate")
    public String toupdateMechant(int id, Model model){
        Mechant mechant=mechantService.getById(id);
        model.addAttribute("mechant",mechant);
        return "mechantupdate";
    }

    @ApiOperation(value="更新商家接口")
    @PostMapping(value = "/update")
    public String  updateMechant(Mechant mechant,Model model){
        mechantService.updateById(mechant);
        List<Mechant> list=mechantService.list();
        model.addAttribute("mechants",list);
        return "mechantlist";
    }

    @ApiOperation(value = "跳转商家列表界面")
    @GetMapping(value = "/list")
    public String getMechants(Model model){
        List<Mechant> list=mechantService.list();
        model.addAttribute("mechants",list);
        return "mechantlist";
    }

    @ApiOperation(value = "根据Id查看商家信息，并跳转商家详情界面")
    @GetMapping(value = "/get")
    public String getMechantById(int id,Model model){
        Mechant mechant=mechantService.getById(id);
        model.addAttribute("mechant",mechant);
        return "mechantinfo";
    }


    @ApiOperation(value = "删除商家,直接删除")
    @GetMapping(value = "/delete")
    public String deleteMechantById(int id, Model model){
        mechantService.removeById(id);
        List<Mechant> list=mechantService.list();
        model.addAttribute("mechants",list);
        return "mechantlist";
    }


    @ApiOperation(value = "跳转商家审核页面")
    @GetMapping(value = "/toaudit")
    public String toAuditMechant(int id,Model model){
        Mechant mechant=mechantService.getById(id);
        model.addAttribute("mechant",mechant);
        return "mechantaudit";
    }

    @ApiOperation(value = "商家审核")
    @PostMapping(value = "/audit")
    public String auditMechantById(Mechant mechant,Model model){
        mechantService.updateById(mechant);
        List<Mechant> list=mechantService.list();
        model.addAttribute("mechants",list);
        return "mechantlist";
    }



}

