package com.java.internal;

import java.util.Objects;

public class WashingMachine {
    private String brand;
    private String type;
    private int capacity;
    private double price;

    public WashingMachine(String brand, String type, int capacity, double price) {
        this.brand = brand;
        this.type = type;
        this.capacity = capacity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "WashingMachine [brand=" + brand + ", type=" + type + ", capacity=" + capacity + ", price=" + price + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof WashingMachine) {
            WashingMachine wm = (WashingMachine) obj;
            if (Objects.equals(this.brand, wm.brand) && Objects.equals(this.type, wm.type)) {
                System.out.println("WashingMachine is matching..");
                return true;
            }
        }
        return false;
    }
}
