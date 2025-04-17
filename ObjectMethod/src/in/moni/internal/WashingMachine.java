package in.moni.internal;

public class WashingMachine{
    private String brand;
    private int capacity;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Washing Machine brand: " + brand + ", Capacity: " + capacity;
    }

    public void start() {
        System.out.println("Washing machine is starting");
    }

    public void rinseClothes() {
        System.out.println("Rinsing clothes");
    }
}
