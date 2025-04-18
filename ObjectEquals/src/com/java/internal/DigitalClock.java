package com.java.internal;

import java.util.Objects;

public class DigitalClock {
    private String brand;
    private boolean is24Hour;
    private String color;
    private double cost;
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setIs24Hour(boolean is24Hour) {
        this.is24Hour = is24Hour;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public String toString() {
        return "DigitalClock [brand="+brand+", is24Hour="+is24Hour+", color="+color+", cost="+cost+"]";
    }
    public boolean equals(Object o) {
        if (o != null && o instanceof DigitalClock) {
            DigitalClock d = (DigitalClock) o;
            if (Objects.equals(this.brand, d.brand) && Objects.equals(this.color, d.color)) {
                System.out.println("DigitalClock is matching..");
                return true;
            }
        } return false;
    }
}
