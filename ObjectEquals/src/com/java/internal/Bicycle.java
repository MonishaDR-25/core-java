package com.java.internal;

import java.util.Objects;

public class Bicycle {
    private String brand;
    private int gearCount;
    private String color;
    private double weight;

    public Bicycle(String brand, int gearCount, String color, double weight) {
        this.brand = brand;
        this.gearCount = gearCount;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Bicycle [brand=" + brand + ", gearCount=" + gearCount + ", color=" + color + ", weight=" + weight + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Bicycle) {
            Bicycle cycle = (Bicycle) obj;
            if (Objects.equals(this.brand, cycle.brand) && Objects.equals(this.gearCount, cycle.gearCount)) {
                System.out.println("Bicycle is matching..");
                return true;
            }
        }
        return false;
    }
}
