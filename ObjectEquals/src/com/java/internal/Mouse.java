package com.java.internal;

import java.util.Objects;

public class Mouse {
    private String brand;
    private boolean wireless;
    private int buttons;
    private double price;

    public Mouse(String brand, boolean wireless, int buttons, double price) {
        this.brand = brand;
        this.wireless = wireless;
        this.buttons = buttons;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mouse [brand=" + brand + ", wireless=" + wireless + ", buttons=" + buttons + ", price=" + price + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Mouse) {
            Mouse mouse = (Mouse) obj;
            if (Objects.equals(this.brand, mouse.brand) && this.wireless == mouse.wireless) {
                System.out.println("Mouse is matching..");
                return true;
            }
        }
        return false;
    }
}
