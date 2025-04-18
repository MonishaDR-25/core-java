package com.java.internal;

import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private double engineCapacity;
    private String color;

    public Car(String brand, String model, double engineCapacity, String color) {
        this.brand = brand;
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.color = color;
    }

    public String toString() {
        return "Car [brand=" + brand + ", model=" + model + ", engineCapacity=" + engineCapacity + ", color=" + color + "]";
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Car) {
            Car car = (Car) obj;
            if (Objects.equals(this.brand, car.brand) && Objects.equals(this.model, car.model)) {
                System.out.println("Car is matching..");
                return true;
            }
        }
        return false;
    }
}
