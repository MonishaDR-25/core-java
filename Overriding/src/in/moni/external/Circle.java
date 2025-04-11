package in.moni.external;

import in.moni.internal.Shape;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }

    public void calculateArea() {
        System.out.println("Calculating circle area");
    }
}
