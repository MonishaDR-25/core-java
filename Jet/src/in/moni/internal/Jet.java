package in.moni.internal;

public class Jet {
    private String model = "Boeing 747";
    private int passengerCapacity = 416;
    private boolean isPrivate = false;
    private double speed = 570.0;
    private String airline = "Delta";

    // Setters
    void setModel(String model) {
        this.model = model;
    }
    void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
    void setIsPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }
    void setSpeed(double speed) {
        this.speed = speed;
    }
    void setAirline(String airline) {
        this.airline = airline;
    }

    // Getters
    public String getModel() {
        return model;
    }
    public int getPassengerCapacity() {
        return passengerCapacity;
    }
    public boolean isPrivate() {
        return isPrivate;
    }
    public double getSpeed() {
        return speed;
    }
    public String getAirline() {
        return airline;
    }
}
