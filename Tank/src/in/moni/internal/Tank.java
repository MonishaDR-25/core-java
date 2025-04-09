package in.moni.internal;

public class Tank {
    private String type = "Main Battle Tank";
    private int crewSize = 4;
    private boolean isArmored = true;
    private double speed = 70.0;
    private String country = "USA";

    // Setters
    void setType(String type) {
        this.type = type;
    }
    void setCrewSize(int crewSize) {
        this.crewSize = crewSize;
    }
    void setIsArmored(boolean isArmored) {
        this.isArmored = isArmored;
    }
    void setSpeed(double speed) {
        this.speed = speed;
    }
    void setCountry(String country) {
        this.country = country;
    }

    // Getters
    public String getType() {
        return type;
    }
    public int getCrewSize() {
        return crewSize;
    }
    public boolean isArmored() {
        return isArmored;
    }
    public double getSpeed() {
        return speed;
    }
    public String getCountry() {
        return country;
    }
}
