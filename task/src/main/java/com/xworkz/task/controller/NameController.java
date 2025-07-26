package com.xworkz.task.controller;

import com.xworkz.task.dto.NameDto;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class NameController {

    public NameController(){
        System.out.println("Running name controller");
    }

    @RequestMapping("/saveName")
    public String onSave(NameDto nameDto, Model model){
        System.out.println("Created on save for name");
        System.out.println(nameDto);
        model.addAttribute("nameDto",nameDto);
        return "/nameResult.jsp";
    }
}
