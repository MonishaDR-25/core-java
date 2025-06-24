package com.xworkz.collection.runner;

import com.xworkz.collection.dto.CampingAccessoriesDto;
import com.xworkz.collection.dto.SareeDto;

import java.util.ArrayList;
import java.util.Collection;

public class CampingAccessoriesRunner {
    public static void main(String[] args) {

        CampingAccessoriesDto campingAccessoriesDto1 = new CampingAccessoriesDto("Tent", "Wildcraft", "Polyester", 3.5, 5000);
        CampingAccessoriesDto campingAccessoriesDto2 = new CampingAccessoriesDto("Sleeping Bag", "Quechua", "Nylon", 1.2, 2000);
        CampingAccessoriesDto campingAccessoriesDto3 = new CampingAccessoriesDto("Lantern", "Eveready", "Plastic", 0.9, 1200);
        CampingAccessoriesDto campingAccessoriesDto4 = new CampingAccessoriesDto("Backpack", "Decathlon", "Canvas", 1.8, 2500);
        CampingAccessoriesDto campingAccessoriesDto5 = new CampingAccessoriesDto("Stove", "Coleman", "Metal", 2.5, 3200);
        CampingAccessoriesDto campingAccessoriesDto6 = new CampingAccessoriesDto("Grill", "Weber", "Iron", 3.0, 4200);
        CampingAccessoriesDto campingAccessoriesDto7 = new CampingAccessoriesDto("Water Bottle", "Milton", "Steel", 0.6, 800);
        CampingAccessoriesDto campingAccessoriesDto8 = new CampingAccessoriesDto("First Aid Kit", "MediCare", "Plastic", 0.5, 600);
        CampingAccessoriesDto campingAccessoriesDto9 = new CampingAccessoriesDto("Raincoat", "Duckback", "Rubber", 1.0, 1000);
        CampingAccessoriesDto campingAccessoriesDto10 = new CampingAccessoriesDto("Hiking Boots", "Woodland", "Leather", 1.4, 4500);

        Collection<CampingAccessoriesDto> collection=new ArrayList<>();
        collection.add(campingAccessoriesDto1);
        collection.add(campingAccessoriesDto2);
        collection.add(campingAccessoriesDto3);
        collection.add(campingAccessoriesDto4);
        collection.add(campingAccessoriesDto5);
        collection.add(campingAccessoriesDto6);
        collection.add(campingAccessoriesDto7);
        collection.add(campingAccessoriesDto8);
        collection.add(campingAccessoriesDto9);
        collection.add(campingAccessoriesDto10);

        for (CampingAccessoriesDto campingAccessoriesDto : collection) {
            System.out.println(campingAccessoriesDto.getName() + "," +
                    campingAccessoriesDto.getBrand() + "," +
                    campingAccessoriesDto.getMaterial() + "," +
                    campingAccessoriesDto.getWeight() + "," +
                    campingAccessoriesDto.getPrice());
        }

    }
}
