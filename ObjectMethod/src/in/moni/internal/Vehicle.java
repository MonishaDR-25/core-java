package in.moni.internal;

public class Vehicle {
    private String model;
    private int year;

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle model: " + model + ", Year: " + year;
    }
    public void move() {
        System.out.println("Vehicle is moving");
    }
}
