package com.java.internal;

import java.util.Objects;

public class Stick {
    private String material;
    private int length;
    private String color;
    private double weight;
    public void setMaterial(String material) {
        this.material = material;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String toString() {
        return "Stick [material="+material+", length="+length+", color="+color+", weight="+weight+"]";
    }
    public boolean equals(Object o) {
        if (o != null && o instanceof Stick) {
            Stick s = (Stick) o;
            if (Objects.equals(this.material, s.material) && Objects.equals(this.length,s.length)) {
                System.out.println("Stick is matching.."); return true;
            }
        } return false;
    }
}
