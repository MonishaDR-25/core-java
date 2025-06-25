package com.xworkz.collection.runner;

import com.xworkz.collection.dto.AppliancesDto;
import com.xworkz.collection.repository.AppliancesRepository;
import com.xworkz.collection.repository.AppliancesRepositoryImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class AppliancesRunner {
    public static void main(String[] args) {

        AppliancesRepository repo = new AppliancesRepositoryImpl();
        Collection<AppliancesDto> appliances = repo.findAll();

        System.out.println("------Using for each------");
        for (AppliancesDto dto : appliances) {
            System.out.println(dto.getName() + "," +
                    dto.getBrand() + "," +
                    dto.getPower() + "W," +
                    dto.getType() + "," +
                    dto.getPrice());
        }

        System.out.println("------Using Iterator------");
        Iterator<AppliancesDto> iterator = appliances.iterator();
        while (iterator.hasNext()) {
            AppliancesDto dto = iterator.next();
            System.out.println(dto.getType() + "," +
                    dto.getPower() + "W," +
                    dto.getBrand() + "," +
                    dto.getPrice() + "," +
                    dto.getName());
        }

        System.out.println("------Appliances with price > 10000------");
        for (AppliancesDto dto : appliances) {
            if (dto.getPrice() > 10000) {
                System.out.println(dto.getName() + " costs " + dto.getPrice());
            }
        }
    }
}
