package in.moni.internal;

public class WaterSource {
    private String type;
    private String location;

    public void setType(String type) {
        this.type = type;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Water Source type: " + type + ", Location: " + location;
    }
    public void flow() {
        System.out.println("Water flowing");
    }
}

