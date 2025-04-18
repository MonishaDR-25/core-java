package com.java.internal;

import java.util.Objects;

public class ElectricKettle {
    private String brand;
    private double volume;
    private boolean autoShutoff;
    private double price;
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setVolume(double volume) {
        this.volume = volume;
    }
    public void setAutoShutoff(boolean autoShutoff) {
        this.autoShutoff = autoShutoff;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String toString() {
        return "ElectricKettle [brand="+brand+", volume="+volume+", autoShutoff="+autoShutoff+", price="+price+"]";
    }
    public boolean equals(Object o) {
        if (o != null && o instanceof ElectricKettle) {
            ElectricKettle e = (ElectricKettle) o;
            if (Objects.equals(this.brand, e.brand) && Objects.equals(this.volume,e.volume)) {
                System.out.println("ElectricKettle is matching..");
                return true;
            }
        } return false;
    }
}
