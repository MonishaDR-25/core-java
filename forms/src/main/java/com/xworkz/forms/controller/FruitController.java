package com.xworkz.forms.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Component
@RequestMapping("/")
public class FruitController {

    public FruitController() {
        System.out.println("Running Fruit Controller");
    }

    @RequestMapping("/saveFruit")
    public String onSave(@RequestParam String name,
                         @RequestParam String color,
                         @RequestParam String taste,
                         @RequestParam String weight,
                         @RequestParam String price,
                         @RequestParam String imported,
                         @RequestParam String vitamins,
                         @RequestParam String calories,
                         @RequestParam String freshness,
                         @RequestParam String storage,
                         Model model) {
        System.out.println("Created on save for fruit");

        model.addAttribute("name", name);
        model.addAttribute("color", color);
        model.addAttribute("taste", taste);
        model.addAttribute("weight", weight);
        model.addAttribute("price", price);
        model.addAttribute("imported", imported);
        model.addAttribute("vitamins", vitamins);
        model.addAttribute("calories", calories);
        model.addAttribute("freshness", freshness);
        model.addAttribute("storage", storage);
        System.out.println("Name:"+name);
        System.out.println("Color:"+color);
        System.out.println("Taste:"+taste);
        System.out.println("Weight:"+weight);
        System.out.println("Price:"+price);
        System.out.println("Imported:"+imported);
        System.out.println("Vitamins:"+vitamins);
        System.out.println("Calories:"+calories);
        System.out.println("Freshness:"+freshness);
        System.out.println("Storage:"+storage);
        return "/FruitResult.jsp";
    }
}
