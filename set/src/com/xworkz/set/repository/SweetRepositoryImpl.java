package com.xworkz.set.repository;

import com.xworkz.set.dto.SweetDto;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SweetRepositoryImpl implements SweetRepository{

    @Override
    public Set<SweetDto> findAll() {

        SweetDto sweetDto1 = new SweetDto("Rasgulla", 20, new String[]{"milk", "sugar", "cardamom", "lemon", "water"}, 10, "Box");
        SweetDto sweetDto2 = new SweetDto("Kaju Katli", 30, new String[]{"cashew", "sugar", "ghee", "rose", "silver leaf"}, 8, "Box");
        SweetDto sweetDto3 = new SweetDto("Ladoo", 25, new String[]{"gram flour", "ghee", "sugar", "nuts", "cardamom"}, 15, "Packet");
        SweetDto sweetDto4 = new SweetDto("Jalebi", 22, new String[]{"maida", "yogurt", "sugar", "saffron", "oil"}, 20, "Box");
        SweetDto sweetDto5 = new SweetDto("Gulab Jamun", 28, new String[]{"khoya", "sugar", "ghee", "rose", "cardamom"}, 12, "Box");
        SweetDto sweetDto6 = new SweetDto("Halwa", 35, new String[]{"semolina", "ghee", "sugar", "milk", "cashew"}, 10, "Box");
        SweetDto sweetDto7 = new SweetDto("Peda", 18, new String[]{"milk", "sugar", "cardamom", "ghee", "saffron"}, 14, "Box");
        SweetDto sweetDto8 = new SweetDto("Barfi", 26, new String[]{"milk", "sugar", "coconut", "ghee", "cardamom"}, 9, "Box");
        SweetDto sweetDto9 = new SweetDto("Mysore Pak", 40, new String[]{"gram flour", "ghee", "sugar", "milk", "cardamom"}, 5, "Box");
        SweetDto sweetDto10 = new SweetDto("Kalakand", 32, new String[]{"milk", "sugar", "paneer", "cardamom", "ghee"}, 6, "Box");
        SweetDto sweetDto11 = new SweetDto("Malpua", 27, new String[]{"flour", "milk", "sugar", "fennel", "cardamom"}, 8, "Box");
        SweetDto sweetDto12 = new SweetDto("Modak", 22, new String[]{"rice flour", "jaggery", "coconut", "ghee", "cardamom"}, 7, "Box");
        SweetDto sweetDto13 = new SweetDto("Chum Chum", 24, new String[]{"paneer", "sugar", "milk", "cardamom", "rose"}, 10, "Box");
        SweetDto sweetDto14 = new SweetDto("Sandesh", 29, new String[]{"paneer", "sugar", "milk", "saffron", "cardamom"}, 6, "Box");
        SweetDto sweetDto15 = new SweetDto("Imarti", 26, new String[]{"urad dal", "sugar", "ghee", "cardamom", "rose"}, 9, "Box");
        SweetDto sweetDto16 = new SweetDto("Kheer", 18, new String[]{"rice", "milk", "sugar", "cardamom", "nuts"}, 12, "Box");
        SweetDto sweetDto17 = new SweetDto("Sheera", 19, new String[]{"semolina", "milk", "ghee", "sugar", "banana"}, 10, "Packet");
        SweetDto sweetDto18 = new SweetDto("Patisa", 31, new String[]{"gram flour", "ghee", "sugar", "milk", "rose"}, 6, "Box");
        SweetDto sweetDto19 = new SweetDto("Shrikhand", 23, new String[]{"curd", "sugar", "saffron", "cardamom", "nuts"}, 10, "Box");
        SweetDto sweetDto20 = new SweetDto("Besan Barfi", 20, new String[]{"gram flour", "sugar", "ghee", "cardamom", "milk"}, 8, "Box");
        SweetDto sweetDto21 = new SweetDto("Badam Halwa", 45, new String[]{"almond", "ghee", "sugar", "milk", "saffron"}, 5, "Box");
        SweetDto sweetDto22 = new SweetDto("Til Laddu", 17, new String[]{"sesame", "jaggery", "cardamom", "ghee", "peanuts"}, 9, "Box");
        SweetDto sweetDto23 = new SweetDto("Pinni", 21, new String[]{"wheat flour", "ghee", "jaggery", "dry fruits", "milk"}, 6, "Packet");
        SweetDto sweetDto24 = new SweetDto("Balushahi", 27, new String[]{"maida", "ghee", "sugar", "curd", "baking soda"}, 5, "Box");
        SweetDto sweetDto25 = new SweetDto("Soan Papdi", 33, new String[]{"gram flour", "ghee", "sugar", "milk", "cardamom"}, 10, "Box");
        SweetDto sweetDto26 = new SweetDto("Khaja", 29, new String[]{"flour", "sugar", "ghee", "cardamom", "milk"}, 8, "Box");
        SweetDto sweetDto27 = new SweetDto("Gujiya", 25, new String[]{"maida", "khoya", "sugar", "coconut", "cardamom"}, 10, "Box");
        SweetDto sweetDto28 = new SweetDto("Sweet Pongal", 30, new String[]{"rice", "jaggery", "ghee", "cashew", "raisins"}, 9, "Box");
        SweetDto sweetDto29 = new SweetDto("Kesari", 19, new String[]{"semolina", "sugar", "ghee", "saffron", "milk"}, 12, "Box");
        SweetDto sweetDto30 = new SweetDto("Tilkut", 24, new String[]{"sesame", "jaggery", "cardamom", "milk", "ghee"}, 8, "Box");

        Set<SweetDto> set=new HashSet<>();
        set.add(sweetDto1);
        set.add(sweetDto2);
        set.add(sweetDto3);
        set.add(sweetDto4);
        set.add(sweetDto5);
        set.add(sweetDto6);
        set.add(sweetDto7);
        set.add(sweetDto8);
        set.add(sweetDto9);
        set.add(sweetDto10);
        set.add(sweetDto11);
        set.add(sweetDto12);
        set.add(sweetDto13);
        set.add(sweetDto14);
        set.add(sweetDto15);
        set.add(sweetDto16);
        set.add(sweetDto17);
        set.add(sweetDto18);
        set.add(sweetDto19);
        set.add(sweetDto20);
        set.add(sweetDto21);
        set.add(sweetDto22);
        set.add(sweetDto23);
        set.add(sweetDto24);
        set.add(sweetDto25);
        set.add(sweetDto26);
        set.add(sweetDto27);
        set.add(sweetDto28);
        set.add(sweetDto29);
        set.add(sweetDto30);

        return set;
    }
}
