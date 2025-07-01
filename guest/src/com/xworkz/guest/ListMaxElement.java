package com.xworkz.guest;

import java.util.ArrayList;
import java.util.Collections;

public class ListMaxElement {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(20);
        scores.add(50);
        scores.add(90);
        scores.add(70);

        System.out.println(Collections.max(scores));
    }
}
