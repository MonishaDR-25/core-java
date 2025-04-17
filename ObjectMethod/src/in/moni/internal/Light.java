package in.moni.internal;

public class Light {
    private String color;
    private int wattage;

    public void setColor(String color) {
        this.color = color;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "Light [color=" + color + ", wattage=" + wattage + "]";
    }
    public void glow() {

        System.out.println("Light glowing");
    }
}

