package com.xworkz.icecream.controller;

import com.xworkz.icecream.configuration.IceCreamConfiguration;
import com.xworkz.icecream.dto.IceCreamDto;
import com.xworkz.icecream.service.IceCreamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/")
public class IceCreamController {

    public IceCreamController(){
        System.out.println("Running Ice Cream Controller");
    }

    @Autowired
    private IceCreamService iceCreamService;

    @RequestMapping("/saveIceCream")
    public String onSave(IceCreamDto iceCreamDto, Model model){
        System.out.println("Created on save");
        boolean saved=iceCreamService.save(iceCreamDto);
        if(saved) {
            Double total = iceCreamService.getTotal(iceCreamDto);
            System.out.println(total);
//            model.addAttribute("dto",iceCreamDto);
//            model.addAttribute("name", iceCreamDto.getName());
//            model.addAttribute("flavour", iceCreamDto.getFlavour());
//            model.addAttribute("quantity", iceCreamDto.getQuantity());
//            model.addAttribute("takeAway", iceCreamDto.getTakeAway());
//            model.addAttribute("addOns", iceCreamDto.getAddOns());
//            model.addAttribute("coupon", iceCreamDto.getCoupon());
            return "/OrderSuccess.jsp";
        } else{
            model.addAttribute("error","Invlaid Values");
            return "/Order.jsp";
        }

    }
}
