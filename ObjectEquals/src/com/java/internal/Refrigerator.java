package com.java.internal;

import java.util.Objects;

public class Refrigerator {
    private String brand;
    private int capacity;
    private String color;
    private double price;

    public Refrigerator(String brand, int capacity, String color, double price) {
        this.brand = brand;
        this.capacity = capacity;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Refrigerator [brand=" + brand + ", capacity=" + capacity + ", color=" + color + ", price=" + price + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Refrigerator) {
            Refrigerator ref = (Refrigerator) obj;
            if (Objects.equals(this.brand, ref.brand) && Objects.equals(this.capacity, ref.capacity)) {
                System.out.println("Refrigerator is matching..");
                return true;
            }
        }
        return false;
    }
}
