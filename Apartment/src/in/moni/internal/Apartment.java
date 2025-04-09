package in.moni.internal;

public class Apartment {
    private String complexName = "Pine View Apartments";
    private int unitNumber = 101;
    private boolean hasParking = true;
    private double rent = 1200.0;
    private String location = "Suburbs";

    // Setters
    void setComplexName(String complexName) {
        this.complexName = complexName;
    }
    void setUnitNumber(int unitNumber) {
        this.unitNumber = unitNumber;
    }
    void setHasParking(boolean hasParking) {
        this.hasParking = hasParking;
    }
    void setRent(double rent) {
        this.rent = rent;
    }
    void setLocation(String location) {
        this.location = location;
    }

    // Getters
    public String getComplexName() {
        return complexName;
    }
    public int getUnitNumber() {
        return unitNumber;
    }
    public boolean hasParking() {
        return hasParking;
    }
    public double getRent() {
        return rent;
    }
    public String getLocation() {
        return location;
    }
}
