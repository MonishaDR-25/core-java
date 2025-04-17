package in.moni.internal;

public class Device {
    private String brand;
    private double price;

    public Device() {
        // default constructor
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Device [Brand = " + brand + ", Price = " + price + "]";
    }
    public void operate() {
        System.out.println("Device operating");
    }
}

