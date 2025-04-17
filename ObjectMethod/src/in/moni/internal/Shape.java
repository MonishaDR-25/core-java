package in.moni.internal;

public class Shape {
    private String name;
    private int sides;

    public void setName(String name) {
        this.name = name;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    @Override
    public String toString() {
        return "Shape: " + name + ", Sides: " + sides;
    }
    public void draw() {

        System.out.println("Drawing shape");
    }
}
