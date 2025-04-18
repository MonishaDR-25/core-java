package com.java.internal;

import java.util.Objects;

public class Plate {
    private String material;
    private double diameter;
    private String color;
    private boolean microwaveSafe;
    public void setMaterial(String material) {
        this.material = material;
    }
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setMicrowaveSafe(boolean microwaveSafe) {
        this.microwaveSafe = microwaveSafe;
    }
    public String toString() {
        return "Plate [material="+material+", diameter="+diameter+", color="+color+", microwaveSafe="+microwaveSafe+"]";
    }
    public boolean equals(Object o) {
        if (o != null && o instanceof Plate) {
            Plate p = (Plate) o;
            if (Objects.equals(this.material, p.material) && Objects.equals(this.diameter,p.diameter)) {
                System.out.println("Plate is matching..");
                return true;
            }
        } return false;
    }
}
