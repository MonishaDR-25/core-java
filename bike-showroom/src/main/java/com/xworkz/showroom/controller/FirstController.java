package com.xworkz.showroom.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class FirstController {

   public FirstController(){
        System.out.println("Created FirstController");
    }

    @RequestMapping("/submit")
    public String onSubmit(){
        System.out.println("Response to submit");
        return "/index.jsp";
    }
}
