package com.java.internal;

import java.util.Objects;

public class Phone {
    private String brand;
    private String model;
    private int ram;
    private double price;

    public Phone(String brand, String model, int ram, double price) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.price = price;
    }

    public String toString() {
        return "Phone [brand=" + brand + ", model=" + model + ", ram=" + ram + ", price=" + price + "]";
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Phone) {
            Phone phone = (Phone) obj;
            if (Objects.equals(this.brand, phone.brand) && Objects.equals(this.model, phone.model)) {
                System.out.println("Phone is matching..");
                return true;
            }
        }
        return false;
    }
}
