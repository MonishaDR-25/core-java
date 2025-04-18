package com.java.internal;
import java.util.Objects;

public class Saucer {
    private String material;
    private String color;
    private double radius;
    private boolean dishwasherSafe;
    public void setMaterial(String material) {
        this.material = material;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setDishwasherSafe(boolean dishwasherSafe) {
        this.dishwasherSafe = dishwasherSafe;
    }
    public String toString() {
        return "Saucer [material="+material+", color="+color+", radius="+radius+", dishwasherSafe="+dishwasherSafe+"]";
    }
    public boolean equals(Object o) {
        if (o != null && o instanceof Saucer) {
            Saucer s = (Saucer) o;
            if (Objects.equals(this.material, s.material) && Objects.equals(this.color, s.color)) {
                System.out.println("Saucer is matching..");
                return true;
            }
        } return false;
    }
}
