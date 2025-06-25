package com.xworkz.collection.repository;

import com.xworkz.collection.dto.FurnitureDto;

import java.util.ArrayList;
import java.util.Collection;

public class FurnitureRepositoryImpl implements FurnitureRepository{
    @Override
    public Collection<FurnitureDto> findAll() {
        FurnitureDto f1 = new FurnitureDto("Sofa", "Leather", "Brown", 45000, "Godrej");
        FurnitureDto f2 = new FurnitureDto("Dining Table", "Wood", "Natural", 35000, "Durian");
        FurnitureDto f3 = new FurnitureDto("Wardrobe", "Plywood", "Dark Brown", 28000, "HomeTown");
        FurnitureDto f4 = new FurnitureDto("Study Table", "MDF", "White", 15000, "Urban Ladder");
        FurnitureDto f5 = new FurnitureDto("Chair", "Plastic", "Black", 1200, "Nilkamal");

        Collection<FurnitureDto> collection = new ArrayList<>();
        collection.add(f1);
        collection.add(f2);
        collection.add(f3);
        collection.add(f4);
        collection.add(f5);

        return collection;
    }
}
