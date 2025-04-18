package com.java.internal;

import java.util.Objects;

public class Scooter {
    private String model;
    private int range;
    private String electric;
    private double price;
    public void setModel(String model) {
        this.model = model;
    }
    public void setRange(int range) {
        this.range = range;
    }
    public void setElectric(String electric) {
        this.electric = electric;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String toString() {
        return "Scooter [model="+model+", range="+range+", electric="+electric+", price="+price+"]";
    }
    public boolean equals(Object o) {
        if (o != null && o instanceof Scooter) {
            Scooter s = (Scooter) o;
            if (Objects.equals(this.model, s.model) && Objects.equals(this.range,s.range)) {
                System.out.println("Scooter is matching..");
                return true;
            }
        } return false;
    }
}
