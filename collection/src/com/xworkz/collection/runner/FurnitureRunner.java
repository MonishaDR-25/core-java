package com.xworkz.collection.runner;

import com.xworkz.collection.dto.FurnitureDto;

import java.util.ArrayList;
import java.util.Collection;

public class FurnitureRunner {
    public static void main(String[] args) {

        FurnitureDto furnitureDto1 = new FurnitureDto("Chair", "Wood", "Brown", 1500, "Godrej");
        FurnitureDto furnitureDto2 = new FurnitureDto("Sofa", "Leather", "Black", 25000, "Urban Ladder");
        FurnitureDto furnitureDto3 = new FurnitureDto("Table", "Metal", "Grey", 5500, "IKEA");
        FurnitureDto furnitureDto4 = new FurnitureDto("Bed", "Wood", "Mahogany", 30000, "Home Centre");
        FurnitureDto furnitureDto5 = new FurnitureDto("Cupboard", "Plywood", "White", 8000, "Nilkamal");
        FurnitureDto furnitureDto6 = new FurnitureDto("TV Stand", "Glass", "Black", 4500, "Durian");
        FurnitureDto furnitureDto7 = new FurnitureDto("Bookshelf", "Wood", "Natural", 3200, "IKEA");
        FurnitureDto furnitureDto8 = new FurnitureDto("Dining Table", "Teak", "Brown", 18000, "Pepperfry");
        FurnitureDto furnitureDto9 = new FurnitureDto("Study Desk", "MDF", "Oak", 6000, "Urban Ladder");
        FurnitureDto furnitureDto10 = new FurnitureDto("Stool", "Plastic", "Red", 500, "Cello");

        Collection<FurnitureDto> furniture = new ArrayList<>();
        furniture.add(furnitureDto1);
        furniture.add(furnitureDto2);
        furniture.add(furnitureDto3);
        furniture.add(furnitureDto4);
        furniture.add(furnitureDto5);
        furniture.add(furnitureDto6);
        furniture.add(furnitureDto7);
        furniture.add(furnitureDto8);
        furniture.add(furnitureDto9);
        furniture.add(furnitureDto10);

        for (FurnitureDto furnitureDto : furniture) {
            System.out.println(furnitureDto.getType() + "," + furnitureDto.getMaterial() + "," + furnitureDto.getColor() + "," + furnitureDto.getPrice() + "," + furnitureDto.getBrand());
        }
    }
}
