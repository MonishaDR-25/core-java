package com.java.internal;

import java.util.Objects;

public class SmartRefrigerator {
    private String brand;
    private int doors;
    private boolean touchscreen;
    private double price;
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }
    public void setTouchscreen(boolean touchscreen) {
        this.touchscreen = touchscreen;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String toString() {
        return "SmartRefrigerator [brand="+brand+", doors="+doors+", touchscreen="+touchscreen+", price="+price+"]";
    }
    public boolean equals(Object o) {
        if (o != null && o instanceof SmartRefrigerator) {
            SmartRefrigerator s = (SmartRefrigerator) o;
            if (Objects.equals(this.brand, s.brand) && Objects.equals(this.doors,s.doors)) {
                System.out.println("SmartRefrigerator is matching..");
                return true;
            }
        } return false;
    }
}
