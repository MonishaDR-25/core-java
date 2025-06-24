package com.xworkz.collection.runner;

import com.xworkz.collection.dto.SareeDto;

import java.util.ArrayList;
import java.util.Collection;

public class SareeRunner {
    public static void main(String[] args) {

        SareeDto sareeDto1=new SareeDto("Marriage","Red","Silk",30000);
        SareeDto sareeDto2=new SareeDto("Engagement","Green","Zari",20000);
        SareeDto sareeDto3=new SareeDto("Sangeet","Maroon","Georgette",14000);
        SareeDto sareeDto4=new SareeDto("Haldi","Yellow","Shiffon",2000);
        SareeDto sareeDto5=new SareeDto("Mehandi","Olive Green","Lenin",5000);
        SareeDto sareeDto6=new SareeDto("Funeral","White","Cotton",400);
        SareeDto sareeDto7=new SareeDto("Reception","Orange","Raw Silk",50000);
        SareeDto sareeDto8=new SareeDto("Office","Pink","Crepe",1988);
        SareeDto sareeDto9=new SareeDto("Graduation","Violet","Netted",3000);
        SareeDto sareeDto10=new SareeDto("Farewell","Purple","Semi Silk",5000);

        Collection<SareeDto> collection=new ArrayList<>();
        collection.add(sareeDto1);
        collection.add(sareeDto2);
        collection.add(sareeDto3);
        collection.add(sareeDto4);
        collection.add(sareeDto5);
        collection.add(sareeDto6);
        collection.add(sareeDto7);
        collection.add(sareeDto8);
        collection.add(sareeDto9);
        collection.add(sareeDto10);

        for(SareeDto sareeDto:collection){
            System.out.println(sareeDto.getType()+","+sareeDto.getColor()+","+sareeDto.getMaterial()+","+sareeDto.getCost());
        }

    }
}
