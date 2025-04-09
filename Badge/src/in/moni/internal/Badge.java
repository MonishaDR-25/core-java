package in.moni.internal;

public class Badge {
    private String material = "metal";
    private int serialNumber = 1000;
    private boolean isActive = true;
    private double weight = 15.5;
    private String department = "Security";

    // Setters
    void setMaterial(String material) {
        this.material = material;
    }
    void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
    void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
    void setWeight(double weight) {
        this.weight = weight;
    }
    void setDepartment(String department) {
        this.department = department;
    }

    // Getters
    public String getMaterial() {
        return material;
    }
    public int getSerialNumber() {
        return serialNumber;
    }
    public boolean isActive() {
        return isActive;
    }
    public double getWeight() {
        return weight;
    }
    public String getDepartment() {
        return department;
    }
}
