package com.xworkz.forms.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class RTOController {

    public RTOController() {
        System.out.println("Running RTO Controller");
    }

    @RequestMapping("/saveRTO")
    public String onSave(@RequestParam String officeName,
                         @RequestParam String region,
                         @RequestParam String officerName,
                         @RequestParam String contactNumber,
                         @RequestParam String totalStaff,
                         @RequestParam String officeCode,
                         Model model) {
        System.out.println("Created on save for RTO");

        model.addAttribute("officeName", officeName);
        model.addAttribute("region", region);
        model.addAttribute("officerName", officerName);
        model.addAttribute("contactNumber", contactNumber);
        model.addAttribute("totalStaff", totalStaff);
        model.addAttribute("officeCode", officeCode);
        System.out.println("Office Name:"+officeName);
        System.out.println("Region:"+region);
        System.out.println("Officer Name:"+officerName);
        System.out.println("Contact Number:"+contactNumber);
        System.out.println("Total Staff:"+totalStaff);
        System.out.println("Office Code:"+officeCode);
        return "/RTOResult.jsp";
    }
}
