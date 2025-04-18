package com.java.internal;
import java.util.Objects;

public class Headset {
    private String brand;
    private String noiseCancelling;
    private String color;
    private double price;
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setNoiseCancelling(String noiseCancelling) {
        this.noiseCancelling = noiseCancelling;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String toString() {
        return "Headset [brand="+brand+", noiseCancelling="+noiseCancelling+", color="+color+", price="+price+"]";
    }
    public boolean equals(Object o) {
        if (o != null && o instanceof Headset) {
            Headset h = (Headset) o;
            if (Objects.equals(this.brand, h.brand) && Objects.equals(this.color, h.color)) {
                System.out.println("Headset is matching..");
                return true;
            }
        } return false;
    }
}
