package in.moni.internal;

public class Ball {
    String material;
    double diameter;

   public Ball(String material, double diameter) {
        this.material = material;
        this.diameter = diameter;
    }

    public String toString() {
        return "Ball[material=" + material + ", diameter=" + diameter + "]";
    }
    public void bounce() {
        System.out.println("Ball bouncing");
    }
}


