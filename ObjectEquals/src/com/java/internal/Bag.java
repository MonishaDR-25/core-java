package com.java.internal;

import java.util.Objects;

public class Bag {
    private String brand;
    private String type;
    private int capacity;
    private String color;

    public Bag(String brand, String type, int capacity, String color) {
        this.brand = brand;
        this.type = type;
        this.capacity = capacity;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bag [brand=" + brand + ", type=" + type + ", capacity=" + capacity + ", color=" + color + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Bag) {
            Bag bag = (Bag) obj;
            if (Objects.equals(this.brand, bag.brand) && Objects.equals(this.type, bag.type)) {
                System.out.println("Bag is matching..");
                return true;
            }
        }
        return false;
    }
}
