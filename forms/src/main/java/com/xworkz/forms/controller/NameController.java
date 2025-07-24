package com.xworkz.forms.controller;

import com.xworkz.forms.dto.NameDto;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class NameController {

    public NameController(){
        System.out.println("Running Name Controller");
    }



    @RequestMapping("/save")
    public String onSave( @RequestParam String firstName,
                         @RequestParam String lastName,
                         @RequestParam String middleName,
                         Model model){
        System.out.println("Created onSend for name");
        model.addAttribute("firstName",firstName);
        model.addAttribute("lastName",lastName);
        model.addAttribute("middleName",middleName);
        System.out.println("First Name:"+firstName);
        System.out.println("Last Name:"+lastName);
        System.out.println("Middle Name:"+middleName);
        return "/NameResult.jsp";
    }
}
