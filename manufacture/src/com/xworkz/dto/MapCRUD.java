package com.xworkz.dto;

import java.util.HashMap;
import java.util.Map;

public class MapCRUD {
    public static void main(String[] args) {

        //create
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Monisha");
        map.put(2,"Lavanya");
        map.put(3,"Hansika");
        map.put(4,"Maithri");
        System.out.println("Added elements are:"+map);

        //read
        String value= map.get(2);
        System.out.println("Value for key2:"+value);

        //update
        map.put(3,"Amruta");
        System.out.println(map);

        //remove
        map.remove(4);
        System.out.println("after removal:"+map);
    }
}
