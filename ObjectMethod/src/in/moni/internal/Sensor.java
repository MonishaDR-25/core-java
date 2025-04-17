package in.moni.internal;

public class Sensor {
    private String type;
    private String status;

    public void setType(String type) {
        this.type = type;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Sensor type: " + type + ", Status: " + status;
    }
    public void detect() {

        System.out.println("Sensor detecting");
    }
}

