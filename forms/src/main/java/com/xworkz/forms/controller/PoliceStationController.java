package com.xworkz.forms.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Component
@RequestMapping("/")
public class PoliceStationController {

    public PoliceStationController() {
        System.out.println("Running PoliceStation Controller");
    }

    @RequestMapping("/savePolice")
    public String onSave(@RequestParam String stationName,
                         @RequestParam String headOfficer,
                         @RequestParam String location,
                         @RequestParam String contact,
                         @RequestParam String jurisdiction,
                         @RequestParam String establishedYear,
                         @RequestParam String staffCount,
                         @RequestParam String crimeRate,
                         @RequestParam String stationCode,
                         @RequestParam String rating,
                         Model model) {
        System.out.println("Created on save for police station");

        model.addAttribute("stationName", stationName);
        model.addAttribute("headOfficer", headOfficer);
        model.addAttribute("location", location);
        model.addAttribute("contact", contact);
        model.addAttribute("jurisdiction", jurisdiction);
        model.addAttribute("establishedYear", establishedYear);
        model.addAttribute("staffCount", staffCount);
        model.addAttribute("crimeRate", crimeRate);
        model.addAttribute("stationCode", stationCode);
        model.addAttribute("rating", rating);
        System.out.println("Station Name:"+stationName);
        System.out.println("Head Officer:"+headOfficer);
        System.out.println("Location:"+location);
        System.out.println("Contact:"+contact);
        System.out.println("Jurisdiction:"+jurisdiction);
        System.out.println("Established Year:"+establishedYear);
        System.out.println("Staff Count:"+staffCount);
        System.out.println("Crime Rate:"+crimeRate);
        System.out.println("Station Code:"+stationCode);
        System.out.println("Rating:"+rating);
        return "/PoliceStationResult.jsp";
    }
}
