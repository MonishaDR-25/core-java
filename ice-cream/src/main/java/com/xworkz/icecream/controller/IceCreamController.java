package com.xworkz.icecream.controller;

import com.xworkz.icecream.configuration.IceCreamConfiguration;
import com.xworkz.icecream.dto.IceCreamDto;
import com.xworkz.icecream.service.IceCreamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


@Controller
@RequestMapping("/")
public class IceCreamController {

    public IceCreamController() {
        System.out.println("Running Ice Cream Controller");
    }

    @Autowired
    private IceCreamService iceCreamService;

    @RequestMapping("/saveIceCream")
    public String onSave(Model model, @Valid IceCreamDto iceCreamDto, BindingResult bindingResult) throws IOException {
        System.out.println("Created on save");

        System.out.println("IceCreamOrder Details" + iceCreamDto);
        if (bindingResult.hasErrors()) {
            bindingResult.getFieldErrors().forEach(error -> System.out.println(error.getField() + " : " + error.getDefaultMessage()));
            System.out.println("Invalid Details");
            model.addAttribute("IceCreamDto", iceCreamDto);
            model.addAttribute("message", "Invalid details");
            return "Order";
        } else {
            return "OrderSuccess";
        }

        byte[] bytes=iceCreamDto.getMultipartFile().getBytes();
        Path path= Paths.get("E:\\File\\"+iceCreamDto.getName()+System.currentTimeMillis());
        Files.write(path,bytes);
        boolean saved=iceCreamService.save(iceCreamDto);
        if(saved) {
            Double total = iceCreamService.getTotal(iceCreamDto);
            System.out.println(total);

            return "OrderSuccess";
        } else{
            model.addAttribute("error","Invlaid Values");
            return "Order";
        }

    }

    }
}
