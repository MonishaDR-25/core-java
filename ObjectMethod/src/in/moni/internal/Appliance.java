package in.moni.internal;

public class Appliance {
    String brand;
    int power;

   public Appliance(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    public String toString() {
        return "Appliance[brand=" + brand + ", power=" + power + "]";
    }
    public void start() {
        System.out.println("Appliance is starting");
    }
}
