package com.xworkz.collection.runner;

import com.xworkz.collection.dto.AppliancesDto;
import com.xworkz.collection.repository.AppliancesRepository;
import com.xworkz.collection.repository.AppliancesRepositoryImpl;

import javax.sound.sampled.Mixer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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

        //contains method
        AppliancesDto dto=new AppliancesDto("Mixer", "Prestige", 450, "Kitchen", 2500);
        System.out.println("Contains 'Mixer'? " + appliances.contains(dto));

        // isEmpty method
        System.out.println("Is Appliances Items are Empty?"+appliances.isEmpty());

        //addAll
        Collection<AppliancesDto> additionalAppliances= new ArrayList<>();
        additionalAppliances.add(new AppliancesDto("Toaster", "Philips", 750, "Kitchen", 1800));
        additionalAppliances.add(new AppliancesDto("Vacuum Cleaner", "Eureka", 1000, "Cleaning", 6000));
        appliances.addAll(additionalAppliances);
        System.out.println("After adding Appliances" +appliances.size());

        //removeAll
        boolean removedAll=appliances.removeAll(additionalAppliances);
        System.out.println("Removed all additional Appliances" +removedAll);
        System.out.println("After removing Additional Appliances" +appliances.size());

        //containsAll
        boolean containsAllOriginal=appliances.containsAll(repo.findAll());
        System.out.println("contains All Appliances"+containsAllOriginal);
    }
}
