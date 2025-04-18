package com.java.internal;

import java.util.Objects;

public class Keyboard {
    private String brand;
    private String type;
    private boolean wireless;
    private double price;

    public Keyboard(String brand, String type, boolean wireless, double price) {
        this.brand = brand;
        this.type = type;
        this.wireless = wireless;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Keyboard [brand=" + brand + ", type=" + type + ", wireless=" + wireless + ", price=" + price + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Keyboard) {
            Keyboard kb = (Keyboard) obj;
            if (Objects.equals(this.brand, kb.brand) && Objects.equals(this.type, kb.type)) {
                System.out.println("Keyboard is matching..");
                return true;
            }
        }
        return false;
    }
}
