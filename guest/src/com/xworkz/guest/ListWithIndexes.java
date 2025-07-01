package com.xworkz.guest;

import java.util.ArrayList;

public class ListWithIndexes {
    public static void main(String[] args) {
        ArrayList<String> techs = new ArrayList<>();
        techs.add("HTML");
        techs.add("CSS");
        techs.add("JavaScript");
        techs.add("Java");

        for (int i = 0; i < techs.size(); i++) {
            System.out.println(i + ": " + techs.get(i));
        }
    }
}
