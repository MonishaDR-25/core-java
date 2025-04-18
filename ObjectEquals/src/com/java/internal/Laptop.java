package com.java.internal;

import java.util.Objects;

public class Laptop {
    private String brand;
    private String processor;
    private int ram;
    private int storage;

    public Laptop(String brand, String processor, int ram, int storage) {
        this.brand = brand;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Laptop [brand=" + brand + ", processor=" + processor + ", ram=" + ram + ", storage=" + storage + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Laptop) {
            Laptop laptop = (Laptop) obj;
            if (Objects.equals(this.brand, laptop.brand) && Objects.equals(this.processor, laptop.processor)) {
                System.out.println("Laptop is matching..");
                return true;
            }
        }
        return false;
    }
}
