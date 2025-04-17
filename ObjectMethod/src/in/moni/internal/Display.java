package in.moni.internal;

public class Display {
    private String type;
    private int resolution;

    public void setType(String type) {
        this.type = type;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "Display [type=" + type + ", resolution=" + resolution + "]";
    }

    public void show() {

        System.out.println("Display showing content");
    }
}

