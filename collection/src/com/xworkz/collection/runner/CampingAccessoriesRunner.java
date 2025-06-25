package com.xworkz.collection.runner;

import com.xworkz.collection.dto.CampingAccessoriesDto;
import com.xworkz.collection.dto.SareeDto;
import com.xworkz.collection.repository.CampingAccessoriesRepository;
import com.xworkz.collection.repository.CampingAccessoriesRepositoryImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CampingAccessoriesRunner {
    public static void main(String[] args) {

        CampingAccessoriesRepository repository = new CampingAccessoriesRepositoryImpl();
        Collection<CampingAccessoriesDto> items = repository.findAll();

        System.out.println("------Using for each------");
        for (CampingAccessoriesDto dto : items) {
            System.out.println(dto.getName() + "," +
                    dto.getBrand() + "," +
                    dto.getMaterial() + "," +
                    dto.getWeight() + "kg," +
                    dto.getPrice());
        }

        System.out.println("------Using Iterator------");
        Iterator<CampingAccessoriesDto> iterator = items.iterator();
        while (iterator.hasNext()) {
            CampingAccessoriesDto dto = iterator.next();
            System.out.println(dto.getMaterial() + "," +
                    dto.getWeight() + "kg," +
                    dto.getBrand() + "," +
                    dto.getPrice() + "," +
                    dto.getName());
        }

        System.out.println("------Camping items with price > 3000------");
        for (CampingAccessoriesDto dto : items) {
            if (dto.getPrice() > 3000) {
                System.out.println(dto.getName() + " costs " + dto.getPrice());
            }
        }
    }
}
