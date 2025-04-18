package com.java.internal;

import java.util.Objects;

public class Television {
    private String brand;
    private double size;
    private String type;
    private double price;

    public Television(String brand, double size, String type, double price) {
        this.brand = brand;
        this.size = size;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Television [brand=" + brand + ", size=" + size + ", type=" + type + ", price=" + price + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Television) {
            Television tv = (Television) obj;
            if (Objects.equals(this.brand, tv.brand) && Objects.equals(this.size, tv.size)) {
                System.out.println("Television is matching..");
                return true;
            }
        }
        return false;
    }
}
