package in.moni.internal;

public class Farm {
    private String type;
    private int area;

    public Farm(String type, int area) {
        this.type = type;
        this.area = area;
    }

    @Override
    public String toString() {
        return "Farm{type='" + type + "', area=" + area + "}";
    }

    public void cultivate() {
        System.out.println("Cultivating crops");
    }
}


