package com.java.internal;

import java.util.Objects;

public class Glass {
    private String type;
    private double capacity;
    private boolean transparent;
    private String material;

    public Glass(String type, double capacity, boolean transparent, String material) {
        this.type = type;
        this.capacity = capacity;
        this.transparent = transparent;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Glass [type=" + type + ", capacity=" + capacity + ", transparent=" + transparent + ", material=" + material + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Glass) {
            Glass glass = (Glass) obj;
            if (Objects.equals(this.type, glass.type) && Objects.equals(this.capacity, glass.capacity)) {
                System.out.println("Glass is matching..");
                return true;
            }
        }
        return false;
    }
}
