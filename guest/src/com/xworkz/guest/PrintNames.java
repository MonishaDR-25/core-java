package com.xworkz.guest;

import java.util.Collection;
import java.util.LinkedList;

public class PrintNames {
    public static void main(String[] args) {
        Collection<String> names=new LinkedList<String>();
        names.add("Kolar");
        names.add("Bengaluru");
        names.add("Bangarpete");
        names.add("KGF");
        names.add("Mysore");
        System.out.println("Cities are:"+names);
    }
}
