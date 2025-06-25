package com.xworkz.collection.runner;

import com.xworkz.collection.dto.CampingAccessoriesDto;
import com.xworkz.collection.dto.SareeDto;
import com.xworkz.collection.dto.TreeDto;
import com.xworkz.collection.repository.SareeRepository;
import com.xworkz.collection.repository.SareeRepositoryImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SareeRunner {
    public static void main(String[] args) {

        SareeRepository sareeRepository = new SareeRepositoryImpl();
        Collection<SareeDto> sarees = sareeRepository.findAll();

        System.out.println("------Using for each------");
        for (SareeDto sareeDto : sarees) {
            System.out.println(sareeDto.getType() + "," +
                    sareeDto.getMaterial() + "," +
                    sareeDto.getCost() + "," +
                    sareeDto.getColor());
        }

        System.out.println("Using Iterator");
        Iterator<SareeDto> iterator = sarees.iterator();
        while (iterator.hasNext()) {
            SareeDto sareeDto = iterator.next();
            System.out.println(sareeDto.getMaterial() + "," + sareeDto.getColor() + "," + sareeDto.getCost() + "," + sareeDto.getType());
        }

        System.out.println("Saree with cost>5000");
        for(SareeDto sareeDto:sarees){
            if(sareeDto.getCost()>5000){
                System.out.println("Sarees above 5000 are:"+sareeDto.getCost());
            }
        }



    }
    }

