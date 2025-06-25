package com.xworkz.collection.repository;

import com.xworkz.collection.dto.CampingAccessoriesDto;

import java.util.ArrayList;
import java.util.Collection;

public class CampingAccessoriesRepositoryImpl implements CampingAccessoriesRepository{
    @Override
    public Collection<CampingAccessoriesDto> findAll() {
        CampingAccessoriesDto c1 = new CampingAccessoriesDto("Tent", "Wildcraft", "Polyester", 3.5, 5500);
        CampingAccessoriesDto c2 = new CampingAccessoriesDto("Sleeping Bag", "Quechua", "Nylon", 1.2, 2500);
        CampingAccessoriesDto c3 = new CampingAccessoriesDto("Torch", "Philips", "Plastic", 0.3, 800);
        CampingAccessoriesDto c4 = new CampingAccessoriesDto("Stove", "Campingaz", "Steel", 2.0, 3000);
        CampingAccessoriesDto c5 = new CampingAccessoriesDto("Backpack", "Decathlon", "Canvas", 1.8, 4000);

        Collection<CampingAccessoriesDto> collection = new ArrayList<>();
        collection.add(c1);
        collection.add(c2);
        collection.add(c3);
        collection.add(c4);
        collection.add(c5);

        return collection;
    }
}
