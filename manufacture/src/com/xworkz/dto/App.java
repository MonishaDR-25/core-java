package com.xworkz.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class App {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("YouTube");
        list.add("Netflix");
        list.add("Google");
        list.add("Gallery");
        list.add("Spotify");
        list.add("Zomato");
        list.add("Myntra");
        list.add("HotStar");
        list.add("Amazon");
        list.add("WhatsApp");

        System.out.println(list);

        ListIterator<String> listIterator= list.listIterator(list.size());

        System.out.println("hasPrevious, previous method in listIterator");
        while(listIterator.hasPrevious()) {
            String app = listIterator.previous();
            System.out.println("previous element is:" + app);


            if (app.equals("YouTube")) {
                listIterator.remove();
            }
            if(app.equals("Spotify")){
                listIterator.add("chatGpt");
            }
        }
        System.out.println("hasNext, next method in listIterator");
        while (listIterator.hasNext()){
            String apps=listIterator.next();
            System.out.println("next element is:"+apps);

            if (apps.equals("chatGpt")) {
                listIterator.remove();
            }
        }

        System.out.println(list);


    }
}
