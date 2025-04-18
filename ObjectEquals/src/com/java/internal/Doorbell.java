package com.java.internal;
import java.util.Objects;

public class Doorbell {
    private String brand;
    private boolean wireless;
    private String ringtone;
    private double price;
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }
    public void setRingtone(String ringtone) {
        this.ringtone = ringtone;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String toString() {
        return "Doorbell [brand="+brand+", wireless="+wireless+", ringtone="+ringtone+", price="+price+"]";
    }
    public boolean equals(Object o) {
        if (o != null && o instanceof Doorbell) {
            Doorbell d = (Doorbell) o;
            if (Objects.equals(this.brand, d.brand) && Objects.equals(this.ringtone, d.ringtone)) {
                System.out.println("Doorbell is matching..");
                return true;
            }
        } return false;
    }
}
