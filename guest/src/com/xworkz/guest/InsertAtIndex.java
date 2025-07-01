package com.xworkz.guest;

import java.util.ArrayList;

public class InsertAtIndex {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.add(2, 99);
        System.out.println(list);
    }
}
