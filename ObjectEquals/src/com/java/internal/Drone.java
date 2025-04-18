package com.java.internal;

import java.util.Objects;

public class Drone {
    private String brand;
    private double weight;
    private int range;
    private String camera;
    public void setBrand(String brand) { this.brand = brand; }
    public void setWeight(double weight) { this.weight = weight; }
    public void setRange(int range) { this.range = range; }
    public void setCamera(String camera) { this.camera = camera; }
    public String toString() { return "Drone [brand="+brand+", weight="+weight+", range="+range+", camera="+camera+"]"; }
    public boolean equals(Object o) {
        if (o != null && o instanceof Drone) {
            Drone d = (Drone) o;
            if (Objects.equals(this.brand, d.brand) && Objects.equals(this.range,d.range)) {
                System.out.println("Drone is matching..");
                return true;
            }
        } return false;
    }
}
