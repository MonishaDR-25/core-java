package com.java.internal;

import java.util.Objects;

public class SmartTV {
    private String brand;
    private int size;
    private boolean is4K;
    private double price;
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public void setIs4K(boolean is4K) {
        this.is4K = is4K;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String toString() {
        return "SmartTV [brand="+brand+", size="+size+", is4K="+is4K+", price="+price+"]";
    }
    public boolean equals(Object o) {
        if (o != null && o instanceof SmartTV) {
            SmartTV s = (SmartTV) o;
            if (Objects.equals(this.brand, s.brand) && Objects.equals(this.size,s.size)) {
                System.out.println("SmartTV is matching..");
                return true;
            }
        } return false;
    }
}
