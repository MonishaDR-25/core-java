package com.java.internal;

import java.util.Objects;

public class Mirror {
    private String shape;
    private double height;
    private double width;
    private boolean framed;

    public Mirror(String shape, double height, double width, boolean framed) {
        this.shape = shape;
        this.height = height;
        this.width = width;
        this.framed = framed;
    }

    @Override
    public String toString() {
        return "Mirror [shape=" + shape + ", height=" + height + ", width=" + width + ", framed=" + framed + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Mirror) {
            Mirror mirror = (Mirror) obj;
            if (Objects.equals(this.shape, mirror.shape) && Objects.equals(this.height, mirror.height)) {
                System.out.println("Mirror is matching..");
                return true;
            }
        }
        return false;
    }
}
