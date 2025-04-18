package com.java.internal;

import java.util.Objects;

public class GPSNavigation {
    private String brand;
    private String screenSize;
    private String voiceSupport;
    private double price;
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }
    public void setVoiceSupport(String voiceSupport) {
        this.voiceSupport = voiceSupport;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String toString() {
        return "GPSNavigation [brand="+brand+", screenSize="+screenSize+", voiceSupport="+voiceSupport+", price="+price+"]";
    }
    public boolean equals(Object o) {
        if (o != null && o instanceof GPSNavigation) {
            GPSNavigation g = (GPSNavigation) o;
            if (Objects.equals(this.brand, g.brand) && Objects.equals(this.screenSize,g.screenSize)) {
                System.out.println("GPSNavigation is matching..");
                return true;
            }
        } return false;
    }
}
