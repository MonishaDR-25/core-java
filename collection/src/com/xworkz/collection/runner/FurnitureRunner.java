package com.xworkz.collection.runner;

import com.xworkz.collection.dto.FurnitureDto;
import com.xworkz.collection.repository.FurnitureRepository;
import com.xworkz.collection.repository.FurnitureRepositoryImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class FurnitureRunner {
    public static void main(String[] args) {

        FurnitureRepository repository = new FurnitureRepositoryImpl();
        Collection<FurnitureDto> furnitureItems = repository.findAll();

        System.out.println("------Using for each------");
        for (FurnitureDto dto : furnitureItems) {
            System.out.println(dto.getType() + "," +
                    dto.getMaterial() + "," +
                    dto.getColor() + "," +
                    dto.getPrice() + "," +
                    dto.getBrand());
        }

        System.out.println("------Using Iterator------");
        Iterator<FurnitureDto> iterator = furnitureItems.iterator();
        while (iterator.hasNext()) {
            FurnitureDto dto = iterator.next();
            System.out.println(dto.getColor() + "," +
                    dto.getMaterial() + "," +
                    dto.getBrand() + "," +
                    dto.getType() + "," +
                    dto.getPrice());
        }

        System.out.println("------Furniture items with price > 20000------");
        for (FurnitureDto dto : furnitureItems) {
            if (dto.getPrice() > 20000) {
                System.out.println(dto.getType() + " costs " + dto.getPrice());
            }
        }
    }
}
