package in.moni.internal;

public class Fan {
    private String brand;
    private int speed;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Fan [Brand = " + brand + ", Speed = " + speed + "]";
    }
    public void rotate() {

        System.out.println("Fan rotating");
    }
}

