package com.java.internal;

import java.util.Objects;

public class Fan {
    private String brand;
    private int speed;
    private double price;
    private String color;

    public Fan(String brand, int speed, double price, String color) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
        this.color = color;
    }

    public String toString() {
        return "Fan [brand=" + brand + ", speed=" + speed + ", price=" + price + ", color=" + color + "]";
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Fan) {
            Fan fan = (Fan) obj;
            if (Objects.equals(this.brand, fan.brand) && Objects.equals(this.speed,fan.speed)) {
                System.out.println("Fan is matching..");
                return true;
            }
        }
        return false;
    }
}
