package com.xworkz.guest;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTask {
    public static void main(String[] args) {
        Collection<Integer> numbers=new ArrayList<Integer>();
        for(int i=0;i<=10;i++)
            numbers.add(i);
        System.out.println("Numbers from 1 to 10 are:"+numbers);

    }
}
