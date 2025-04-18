package com.java.internal;

import java.util.Objects;

public class Shoe {
    private String brand;
    private String size;
    private String color;
    private boolean sports;

    public Shoe(String brand, String size, String color, boolean sports) {
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.sports = sports;
    }

    @Override
    public String toString() {
        return "Shoe [brand=" + brand + ", size=" + size + ", color=" + color + ", sports=" + sports + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Shoe) {
            Shoe shoe = (Shoe) obj;
            if (Objects.equals(this.brand, shoe.brand) && Objects.equals(this.size, shoe.size)) {
                System.out.println("Shoe is matching..");
                return true;
            }
        }
        return false;
    }
}
