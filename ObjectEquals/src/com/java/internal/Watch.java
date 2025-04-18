package com.java.internal;

import java.util.Objects;

public class Watch {
    private String brand;
    private String type;
    private boolean smart;
    private double price;

    public Watch(String brand, String type, boolean smart, double price) {
        this.brand = brand;
        this.type = type;
        this.smart = smart;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Watch [brand=" + brand + ", type=" + type + ", smart=" + smart + ", price=" + price + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Watch) {
            Watch watch = (Watch) obj;
            if (Objects.equals(this.brand, watch.brand) && Objects.equals(this.type, watch.type)) {
                System.out.println("Watch is matching..");
                return true;
            }
        }
        return false;
    }
}
