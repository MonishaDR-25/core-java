package com.xworkz.guest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortAlphabets {
    public static void main(String[] args) {
        List<String> names=new ArrayList<String>();
        names.add("Gayatri");
        names.add("Sudha Rani");
        names.add("Chandana");
        names.add("Monisha");
        names.add("Varshan");
        Collections.sort(names);
        System.out.println("Sorted names are"+names);
    }
}
