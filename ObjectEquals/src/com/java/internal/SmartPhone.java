package com.java.internal;

import java.util.Objects;

public class SmartPhone {
    private String brand;
    private String model;
    private int storage;
    private double price;
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String setModel) {
        this.model = model;
    }
    public void setStorage(int storage) {
        this.storage = storage;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String toString() {
        return "SmartPhone [brand="+brand+", model="+model+", storage="+storage+", price="+price+"]";
    }
    public boolean equals(Object o) {
        if (o != null && o instanceof SmartPhone) {
            SmartPhone s = (SmartPhone) o;
            if (Objects.equals(this.brand, s.brand) && Objects.equals(this.model, s.model)) {
                System.out.println("SmartPhone is matching.."); return true;
            }
        } return false;
    }
}
