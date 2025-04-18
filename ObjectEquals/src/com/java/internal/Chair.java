package com.java.internal;

import java.util.Objects;

public class Chair {
    private String material;
    private String color;
    private boolean hasArmrest;
    private double height;

    public Chair(String material, String color, boolean hasArmrest, double height) {
        this.material = material;
        this.color = color;
        this.hasArmrest = hasArmrest;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Chair [material=" + material + ", color=" + color + ", hasArmrest=" + hasArmrest + ", height=" + height + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Chair) {
            Chair chair = (Chair) obj;
            if (Objects.equals(this.material, chair.material) && Objects.equals(this.color, chair.color)) {
                System.out.println("Chair is matching..");
                return true;
            }
        }
        return false;
    }
}
