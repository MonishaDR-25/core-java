package com.java.internal;

import java.util.Objects;

public class Table {
    private String shape;
    private String material;
    private double length;
    private double width;

    public Table(String shape, String material, double length, double width) {
        this.shape = shape;
        this.material = material;
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Table [shape=" + shape + ", material=" + material + ", length=" + length + ", width=" + width + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Table) {
            Table table = (Table) obj;
            if (Objects.equals(this.shape, table.shape) && Objects.equals(this.material, table.material)) {
                System.out.println("Table is matching..");
                return true;
            }
        }
        return false;
    }
}
