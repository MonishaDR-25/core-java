package in.moni.internal;

public class PostOffice {
    private String name = "Main Post Office";
    private int numberOfEmployees = 20;
    private boolean isOpen = true;
    private double dailyLetters = 500.5;
    private String location = "Downtown";

    // Setters
    void setName(String name) {
        this.name = name;
    }
    void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
    void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }
    void setDailyLetters(double dailyLetters) {
        this.dailyLetters = dailyLetters;
    }
    void setLocation(String location) {
        this.location = location;
    }

    // Getters
    public String getName() {
        return name;
    }
    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }
    public boolean isOpen() {
        return isOpen;
    }
    public double getDailyLetters() {
        return dailyLetters;
    }
    public String getLocation() {
        return location;
    }
}


