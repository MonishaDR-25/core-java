package com.xworkz.collection.runner;

import com.xworkz.collection.dto.CampingAccessoriesDto;
import com.xworkz.collection.repository.CampingAccessoriesRepository;
import com.xworkz.collection.repository.CampingAccessoriesRepositoryImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CampingAccessoriesRunner {
    public static void main(String[] args) {
        CampingAccessoriesRepository repo = new CampingAccessoriesRepositoryImpl();
        Collection<CampingAccessoriesDto> accessories = repo.findAll();

        System.out.println("------All Camping Accessories (for-each)------");
        for (CampingAccessoriesDto dto : accessories) {
            System.out.println(dto);
        }

        System.out.println("\n------Accessories (Iterator)------");
        Iterator<CampingAccessoriesDto> iterator = accessories.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\n------Accessories with price > 2000------");
        for (CampingAccessoriesDto dto : accessories) {
            if (dto.getPrice() > 2000) {
                System.out.println(dto.getName() + " - Rs." + dto.getPrice());
            }
        }

        // contains
        CampingAccessoriesDto checkDto = new CampingAccessoriesDto("Backpack", "Decathlon", "Canvas", 1.8, 4000);
        System.out.println("Contains Backpack? " + accessories.contains(checkDto));

        // remove
        boolean removed = accessories.remove(checkDto);
        System.out.println("Removed 'Backpack'? " + removed);
        System.out.println("Contains 'Backpack' after removal? " + accessories.contains(checkDto));

        // isEmpty
        System.out.println("\nIs accessories collection empty? " + accessories.isEmpty());

        // addAll
        Collection<CampingAccessoriesDto> newItems = new ArrayList<>();
        newItems.add(new CampingAccessoriesDto("Water Bottle", "Milton", "Steel", 0.7, 600));
        newItems.add(new CampingAccessoriesDto("Foldable Chair", "Decathlon", "Aluminium", 2.5, 1800));
        accessories.addAll(newItems);
        System.out.println("\nAfter addAll():"+accessories.addAll(newItems));


        // removeAll
        boolean removedAll = accessories.removeAll(newItems);
        System.out.println("\nRemoved all new items? " + removedAll);

        // containsAll
        Collection<CampingAccessoriesDto> originals = repo.findAll();
        System.out.println("Contains all original accessories? " + accessories.containsAll(originals));
    }
}
