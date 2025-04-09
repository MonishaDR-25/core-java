package in.moni.internal;

public class Gym {
    private String name = "Fitness Center";
    private int members = 500;
    private boolean is24Hours = false;
    private double monthlyFee = 49.99;
    private String location = "Local";

    // Setters
    void setName(String name) {
        this.name = name;
    }
    void setMembers(int members) {
        this.members = members;
    }
    void setIs24Hours(boolean is24Hours) {
        this.is24Hours = is24Hours;
    }
    void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }
    void setLocation(String location) {
        this.location = location;
    }

    // Getters
    public String getName() {
        return name;
    }
    public int getMembers() {
        return members;
    }
    public boolean is24Hours() {
        return is24Hours;
    }
    public double getMonthlyFee() {
        return monthlyFee;
    }
    public String getLocation() {
        return location;
    }
}
