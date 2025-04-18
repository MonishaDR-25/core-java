package com.java.internal;

import java.util.Objects;

public class Speaker {
    private String brand;
    private String type;
    private int power;
    private double price;

    public Speaker(String brand, String type, int power, double price) {
        this.brand = brand;
        this.type = type;
        this.power = power;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Speaker [brand=" + brand + ", type=" + type + ", power=" + power + ", price=" + price + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Speaker) {
            Speaker speaker = (Speaker) obj;
            if (Objects.equals(this.brand, speaker.brand) && Objects.equals(this.type, speaker.type)) {
                System.out.println("Speaker is matching..");
                return true;
            }
        }
        return false;
    }
}
