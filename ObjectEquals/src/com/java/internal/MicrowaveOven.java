package com.java.internal;

import java.util.Objects;

public class MicrowaveOven {
    private String brand;
    private int capacity;
    private boolean grillOption;
    private double price;
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void setGrillOption(boolean grillOption) {
        this.grillOption = grillOption;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String toString() {
        return "MicrowaveOven [brand="+brand+", capacity="+capacity+", grillOption="+grillOption+", price="+price+"]";
    }
    public boolean equals(Object o) {
        if (o != null && o instanceof MicrowaveOven) {
            MicrowaveOven m = (MicrowaveOven) o;
            if (Objects.equals(this.brand, m.brand) && Objects.equals(this.capacity,m.capacity)) {
                System.out.println("MicrowaveOven is matching..");
                return true;
            }
        } return false;
    }
}
