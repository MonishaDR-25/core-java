package com.xworkz.icecream.controller;

import com.xworkz.icecream.dto.IceCreamDto;
import com.xworkz.icecream.service.EmailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

public class EmailController {
    @Autowired
     EmailSender emailSender;

    @PostMapping("/saveIceCream")
    public String getEmail(IceCreamDto iceCreamDto){
        emailSender.mailSend(iceCreamDto.getEmail(),"abc123");
        return "OrderSuccess";
    }
}
