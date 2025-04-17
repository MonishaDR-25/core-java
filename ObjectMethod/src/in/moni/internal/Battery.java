package in.moni.internal;

public class Battery {
    private String brand;
    private int capacity;

    public Battery(String brand, int capacity) {
        this.brand = brand;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Battery{brand='" + brand + "', capacity=" + capacity + "}";
    }
    public void charge() {
        System.out.println("Charging battery");
    }
}


