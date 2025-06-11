package com.xworkz.service;

import com.xworkz.dto.StampedeCaseDto;
import com.xworkz.repository.ProductRepository;
import com.xworkz.repository.ProductRepositoryImpl;
import com.xworkz.repository.StampedeCaseRepository;
import com.xworkz.repository.StampedeCaseRepositoryImpl;

public class StampedeCaseServiceImpl implements StampedeCaseService{
    @Override
    public String save(StampedeCaseDto stampedeCaseDto) {
        System.out.println("Saving ProductDto in ProductServiceImpl: " +stampedeCaseDto);

        if (stampedeCaseDto != null) {
            System.out.println("stampede case is not null");

                int deaths = Integer.parseInt(stampedeCaseDto.getNoOfDeaths());
                if (deaths >= 0) {
                    System.out.println("Number of deaths is valid");
                } else {
                    System.err.println("Invalid number of deaths");
                    return "failure";
                }

                int injuries = Integer.parseInt(stampedeCaseDto.getNoOfInjuries());
                if (injuries >= 0) {
                    System.out.println("Number of injuries is valid");
                } else {
                    System.err.println("Invalid number of injuries");
                    return "failure";
                }

                String location = stampedeCaseDto.getLocation();
                if (location != null && location.length() >= 3 && location.length() <= 50) {
                    System.out.println("Location is valid");
                } else {
                    System.err.println("Location is invalid");
                    return "failure";
                }

                String event = stampedeCaseDto.getEvent();
                if (event != null && event.length() >= 3 && event.length() <= 50) {
                    System.out.println("Event is valid");
                } else {
                    System.err.println("Event is invalid");
                    return "failure";
                }

            } else {
                System.err.println("StampedeCaseDTO is null");
                return "failure";
            }

        StampedeCaseRepository stampedeCaseRepository=new StampedeCaseRepositoryImpl();
        stampedeCaseRepository.persist(stampedeCaseDto);


        System.out.println("Stampede data is good...");

            return "success";
    }
}
