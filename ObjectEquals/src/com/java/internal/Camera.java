package com.java.internal;

import java.util.Objects;

public class Camera {
    private String brand;
    private String model;
    private int resolution;
    private double price;

    public Camera(String brand, String model, int resolution, double price) {
        this.brand = brand;
        this.model = model;
        this.resolution = resolution;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Camera [brand=" + brand + ", model=" + model + ", resolution=" + resolution + ", price=" + price + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Camera) {
            Camera camera = (Camera) obj;
            if (Objects.equals(this.brand, camera.brand) && Objects.equals(this.model, camera.model)) {
                System.out.println("Camera is matching..");
                return true;
            }
        }
        return false;
    }
}
