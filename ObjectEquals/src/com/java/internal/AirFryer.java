package com.java.internal;

import java.util.Objects;

public class AirFryer {
    private String brand;
    private int capacity;
    private boolean digital;
    private double cost;
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void setDigital(boolean digital) {
        this.digital = digital;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public String toString() {
        return "AirFryer [brand="+brand+", capacity="+capacity+", digital="+digital+", cost="+cost+"]";
    }
    public boolean equals(Object o) {
        if (o != null && o instanceof AirFryer) {
            AirFryer a = (AirFryer) o;
            if (Objects.equals(this.brand, a.brand) && Objects.equals(this.capacity,a.capacity)) {
                System.out.println("AirFryer is matching..");
                return true;
            }
        } return false;
    }
}
