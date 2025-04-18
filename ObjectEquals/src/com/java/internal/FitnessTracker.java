package com.java.internal;

import java.util.Objects;

public class FitnessTracker {
    private String brand;
    private boolean waterproof;
    private int batteryLife;
    private double price;
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setWaterproof(boolean waterproof) {
        this.waterproof = waterproof;
    }
    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String toString() {
        return "FitnessTracker [brand="+brand+", waterproof="+waterproof+", batteryLife="+batteryLife+", price="+price+"]";
    }
    public boolean equals(Object o) {
        if (o != null && o instanceof FitnessTracker) {
            FitnessTracker f = (FitnessTracker) o;
            if (Objects.equals(this.brand, f.brand) && Objects.equals(this.waterproof,f.waterproof)) {
                System.out.println("FitnessTracker is matching..");
                return true;
            }
        } return false;
    }
}
