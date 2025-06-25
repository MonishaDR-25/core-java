package com.xworkz.collection.repository;

import com.xworkz.collection.dto.AppliancesDto;

import java.util.ArrayList;
import java.util.Collection;

public class AppliancesRepositoryImpl implements AppliancesRepository {

    @Override
    public Collection<AppliancesDto> findAll() {
        AppliancesDto dto1 = new AppliancesDto("Washing Machine", "LG", 500, "Home", 30000);
        AppliancesDto dto2 = new AppliancesDto("Refrigerator", "Samsung", 800, "Kitchen", 45000);
        AppliancesDto dto3 = new AppliancesDto("Mixer", "Prestige", 450, "Kitchen", 2500);
        AppliancesDto dto4 = new AppliancesDto("Air Conditioner", "Daikin", 1200, "Cooling", 42000);
        AppliancesDto dto5 = new AppliancesDto("Microwave", "IFB", 1000, "Kitchen", 15000);

        Collection<AppliancesDto> collection = new ArrayList<>();
        collection.add(dto1);
        collection.add(dto2);
        collection.add(dto3);
        collection.add(dto4);
        collection.add(dto5);


        return collection;
    }
}
