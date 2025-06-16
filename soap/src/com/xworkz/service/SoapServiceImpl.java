package com.xworkz.service;

import com.xworkz.dto.SoapDto;
import com.xworkz.repository.SoapRepository;
import com.xworkz.repository.SoapRepositoryImpl;

public class SoapServiceImpl implements SoapService{
    @Override
    public String save(SoapDto soapDto) {
        System.out.println("Saving Soap in SoapServiceImpl"+soapDto);

        if(soapDto!=null){
            System.out.println("SoapDto is not null");

            String name = soapDto.getName();
            if (name != null && name.length() >= 3 && name.length() <= 50) {
                System.out.println("Name is valid");
            } else {
                System.err.println("Invalid Name");
                return "failure";
            }

            String brand = soapDto.getBrand();
            if (brand != null && brand.length() >= 2 && brand.length() <= 30) {
                System.out.println("Brand is valid");
            } else {
                System.err.println("Invalid Brand");
                return "failure";
            }

            if (soapDto.getPrice() >= 1 && soapDto.getPrice() <= 1000) {
                System.out.println("Price is valid");
            } else {
                System.err.println("Invalid Price");
                return "failure";
            }

            if (soapDto.getManufactureDate() != null) {
                System.out.println("Manufacture Date is valid");
            } else {
                System.err.println("Invalid Manufacture Date");
                return "failure";
            }

            String color = soapDto.getColor();
            if (color != null && color.length() >= 2 && color.length() <= 20) {
                System.out.println("Color is valid");
            } else {
                System.err.println("Invalid Color");
                return "failure";
            }

            // No complex validation for boolean field `fragrant` (it's a primitive)
            System.out.println("Fragrant field is valid");

        } else {
            System.err.println("SoapDto is null");
            return "failure";
        }

        // Save to DB
        SoapRepository soapRepository = new SoapRepositoryImpl();
        soapRepository.persist(soapDto);

        System.out.println("Soap data validated and saved successfully");

        return "success";
    }
}
