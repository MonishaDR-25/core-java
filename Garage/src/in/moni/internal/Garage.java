package in.moni.internal;

public class Garage {
    private String type = "Residential";
    private int capacity = 2;
    private boolean isHeated = false;
    private double width = 20.0;
    private String doorType = "Automatic";

    // Setters
    void setType(String type) {
        this.type = type;
    }
    void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    void setIsHeated(boolean isHeated) {
        this.isHeated = isHeated;
    }
    void setWidth(double width) {
        this.width = width;
    }
    void setDoorType(String doorType) {
        this.doorType = doorType;
    }

    // Getters
    public String getType() {
        return type;
    }
    public int getCapacity() {
        return capacity;
    }
    public boolean isHeated() {
        return isHeated;
    }
    public double getWidth() {
        return width;
    }
    public String getDoorType() {
        return doorType;
    }
}
