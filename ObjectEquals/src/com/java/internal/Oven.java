package com.java.internal;

import java.util.Objects;

public class Oven {
    private String brand;
    private String type;
    private int capacity;
    private double price;

    public Oven(String brand, String type, int capacity, double price) {
        this.brand = brand;
        this.type = type;
        this.capacity = capacity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Oven [brand=" + brand + ", type=" + type + ", capacity=" + capacity + ", price=" + price + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Oven) {
            Oven oven = (Oven) obj;
            if (Objects.equals(this.brand, oven.brand) && Objects.equals(this.type, oven.type)) {
                System.out.println("Oven is matching..");
                return true;
            }
        }
        return false;
    }
}
