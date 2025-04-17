package in.moni.internal;

public class FuelStation {
    private String brand;
    private int litres;

    public FuelStation(String brand, int litres) {
        this.brand = brand;
        this.litres = litres;
    }

    @Override
    public String toString() {
        return "FuelStation{brand='" + brand + "', litres=" + litres + "}";
    }
    public void refill() {
        System.out.println("Refilling fuel");
    }
}


