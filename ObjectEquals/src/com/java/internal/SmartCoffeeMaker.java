package com.java.internal;

import java.util.Objects;

public class SmartCoffeeMaker {
    private String brand;
    private boolean wifiEnabled;
    private int brewTime;
    private double price;
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setWifiEnabled(boolean wifiEnabled) {
        this.wifiEnabled = wifiEnabled;
    }
    public void setBrewTime(int brewTime) {
        this.brewTime = brewTime;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String toString() {
        return "SmartCoffeeMaker [brand="+brand+", wifiEnabled="+wifiEnabled+", brewTime="+brewTime+", price="+price+"]";
    }
    public boolean equals(Object o) {
        if (o != null && o instanceof SmartCoffeeMaker) {
            SmartCoffeeMaker s = (SmartCoffeeMaker) o;
            if (Objects.equals(this.brand, s.brand) && Objects.equals(this.wifiEnabled,s.wifiEnabled)) {
                System.out.println("SmartCoffeeMaker is matching.."); return true;
            }
        } return false;
    }
}
