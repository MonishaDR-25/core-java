package com.java.internal;

import java.util.Objects;

public class Bottle {
    private String color;
    private double capacity;
    private String material;
    private boolean reusable;

    public Bottle(String color, double capacity, String material, boolean reusable) {
        this.color = color;
        this.capacity = capacity;
        this.material = material;
        this.reusable = reusable;
    }

    @Override
    public String toString() {
        return "Bottle [color=" + color + ", capacity=" + capacity + ", material=" + material + ", reusable=" + reusable + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Bottle) {
            Bottle bottle = (Bottle) obj;
            if (Objects.equals(this.color, bottle.color) && Objects.equals(this.capacity, bottle.capacity)) {
                System.out.println("Bottle is matching..");
                return true;
            }
        }
        return false;
    }
}
