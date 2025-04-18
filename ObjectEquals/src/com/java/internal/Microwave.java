package com.java.internal;

import java.util.Objects;

public class Microwave {
    private String brand;
    private double capacity;
    private boolean grillFeature;
    private double price;
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
    public void setGrillFeature(boolean grillFeature) {
        this.grillFeature = grillFeature;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String toString() {
        return "Microwave [brand="+brand+", capacity="+capacity+", grillFeature="+grillFeature+", price="+price+"]";
    }
    public boolean equals(Object o) {
        if (o != null && o instanceof Microwave) {
            Microwave m = (Microwave) o;
            if (Objects.equals(this.brand, m.brand) && Objects.equals(this.capacity,m.capacity)) {
                System.out.println("Microwave is matching..");
                return true;
            }
        } return false;
    }
}
