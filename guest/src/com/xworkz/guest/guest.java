package com.xworkz.guest;

import java.util.HashSet;
import java.util.Set;

public class guest {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("Monisha");
        set.add("Lavanya");
        set.add("Joseph");
        set.add("Romeo");
        set.add("Juliet");
        System.out.println(set);

        boolean result=set.contains("Monisha");
        System.out.println(result);

       boolean empty=set.isEmpty();
        System.out.println("Is set empty?"+empty);

         boolean removed=set.remove("Romeo");
        System.out.println("Is Romeo removed:"+removed);

        System.out.println("Size of a set:"+set.size());


    }
}
