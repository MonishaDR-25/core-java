package com.java.internal;

import java.util.Objects;

public class AirConditioner {
    private String brand;
    private double tonnage;
    private boolean inverter;
    private double price;

    public AirConditioner(String brand, double tonnage, boolean inverter, double price) {
        this.brand = brand;
        this.tonnage = tonnage;
        this.inverter = inverter;
        this.price = price;
    }

    @Override
    public String toString() {
        return "AirConditioner [brand=" + brand + ", tonnage=" + tonnage + ", inverter=" + inverter + ", price=" + price + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof AirConditioner) {
            AirConditioner ac = (AirConditioner) obj;
            if (Objects.equals(this.brand, ac.brand) && Objects.equals(this.tonnage, ac.tonnage)) {
                System.out.println("AirConditioner is matching..");
                return true;
            }
        }
        return false;
    }
}
