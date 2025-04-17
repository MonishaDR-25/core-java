package in.moni.internal;

public class SensorDevice {
    private String model;
    private String function;

    public void setModel(String model) {
        this.model = model;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    @Override
    public String toString() {
        return "SensorDevice model: " + model + ", Function: " + function;
    }
    public void monitor() {
        System.out.println("Monitoring environment");
    }
}


