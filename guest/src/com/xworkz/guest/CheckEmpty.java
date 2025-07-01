package com.xworkz.guest;

import java.util.HashSet;
import java.util.Set;

public class CheckEmpty {
    public static void main(String[] args) {
        Set<String> set=new HashSet<String>();
        set.add("Gayatri");
        set.add("Sudha Rani");
        set.add("Chandana");
        set.add("Monisha");
        set.add("Varshan");
        boolean result= set.isEmpty();
        System.out.println("Is set empty:"+result);
    }
}
