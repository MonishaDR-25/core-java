package com.xworkz.forms.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class HospitalController {

    public HospitalController(){
        System.out.println("Running Hospital Controller");
    }

    @RequestMapping("/saveHospital")
    public String onSave(@RequestParam String name,
                         @RequestParam String location,
                         @RequestParam String specialty,
                         @RequestParam String capacity,
                         @RequestParam String contact,
                         @RequestParam String rating,
                         Model model) {
        System.out.println("Created on save for hospital");

        model.addAttribute("name", name);
        model.addAttribute("location", location);
        model.addAttribute("specialty", specialty);
        model.addAttribute("capacity", capacity);
        model.addAttribute("contact", contact);
        model.addAttribute("rating", rating);
        System.out.println("Name:"+name);
        System.out.println("Location:"+location);
        System.out.println("Specialty:"+specialty);
        System.out.println("Capacity:"+capacity);
        System.out.println("Contact:"+contact);
        System.out.println("Rating:"+rating);
        return "/HospitalResult.jsp";
    }
}
