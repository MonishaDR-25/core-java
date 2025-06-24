package com.xworkz.collection.runner;

import com.xworkz.collection.dto.AppliancesDto;

import java.util.ArrayList;
import java.util.Collection;

public class AppliancesRunner {
    public static void main(String[] args) {
        AppliancesDto a1 = new AppliancesDto("Washing Machine", "LG", 2000, "Automatic", 25000);
        AppliancesDto a2 = new AppliancesDto("Microwave", "Samsung", 800, "Convection", 12000);
        AppliancesDto a3 = new AppliancesDto("Refrigerator", "Whirlpool", 500, "Double Door", 35000);
        AppliancesDto a4 = new AppliancesDto("Mixer", "Preethi", 750, "Grinder", 3500);
        AppliancesDto a5 = new AppliancesDto("Fan", "Havells", 75, "Ceiling", 1800);
        AppliancesDto a6 = new AppliancesDto("Heater", "Usha", 1500, "Room Heater", 2200);
        AppliancesDto a7 = new AppliancesDto("AC", "Voltas", 1800, "Split", 40000);
        AppliancesDto a8 = new AppliancesDto("Geyser", "Bajaj", 2000, "Instant", 7000);
        AppliancesDto a9 = new AppliancesDto("Toaster", "Philips", 850, "Pop-up", 1800);
        AppliancesDto a10 = new AppliancesDto("Vacuum Cleaner", "Dyson", 1200, "Cordless", 28000);

        Collection<AppliancesDto> appliances = new ArrayList<>();
        appliances.add(a1);
        appliances.add(a2);
        appliances.add(a3);
        appliances.add(a4);
        appliances.add(a5);
        appliances.add(a6);
        appliances.add(a7);
        appliances.add(a8);
        appliances.add(a9);
        appliances.add(a10);

        for (AppliancesDto appliancesDto : appliances) {
            System.out.println(appliancesDto.getName() + "," + appliancesDto.getBrand() + "," + appliancesDto.getPower() + "," + appliancesDto.getType() + "," + appliancesDto.getPrice());
        }
    }
}
