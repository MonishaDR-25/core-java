package in.moni.internal;

public class Computer {
    String brand;
    int ram;

   public Computer(String brand, int ram) {
        this.brand = brand;
        this.ram = ram;
    }

    public String toString() {
        return "Computer[brand=" + brand + ", ram=" + ram + "]";
    }
    public void process() {
        System.out.println("Computer processing");
    }
}

