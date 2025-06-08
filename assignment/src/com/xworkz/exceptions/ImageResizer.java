package com.xworkz.exceptions;

public class ImageResizer {
    public static void resize(int width, int height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Width and height must be non-negative.");
        }
        System.out.println("Image resized to " + width + "x" + height);
    }

    public static void main(String[] args) {
        try {
            resize(800, -600);
        } catch (IllegalArgumentException e) {
            System.out.println("Resize failed: " + e.getMessage());
        }
    }
}
