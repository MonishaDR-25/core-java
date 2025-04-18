package com.java.internal;

import java.util.Objects;

public class GamingConsole {
    private String brand;
    private String model;
    private int wireless;
    private double price;
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setWireless(int wireless) {
        this.wireless = wireless;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String toString() {
        return "GamingConsole [brand="+brand+", model="+model+", wireless="+wireless+", price="+price+"]";
    }
    public boolean equals(Object o) {
        if (o != null && o instanceof GamingConsole) {
            GamingConsole g = (GamingConsole) o;
            if (Objects.equals(this.brand, g.brand) && Objects.equals(this.model, g.model)) {
                System.out.println("GamingConsole is matching..");
                return true;
            }
        } return false;
    }
}
