package com.java.internal;

import java.util.Objects;

public class Farm {
    private String name;
    private double area;
    private String location;
    private int numberOfAnimals;

    public Farm(String name, double area, String location, int numberOfAnimals) {
        this.name = name;
        this.area = area;
        this.location = location;
        this.numberOfAnimals = numberOfAnimals;
    }

    @Override
    public String toString() {
        return "Farm [name=" + name + ", area=" + area + ", location=" + location + ", numberOfAnimals=" + numberOfAnimals + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Farm) {
            Farm farm = (Farm) obj;
            if (Objects.equals(this.name, farm.name) && Objects.equals(this.area,farm.area)) {
                System.out.println("Farm is matching..");
                return true;
            }
        }
        return false;
    }
}
