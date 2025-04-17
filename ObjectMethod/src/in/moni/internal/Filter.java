package in.moni.internal;

public class Filter {
    private String type;
    private String brand;

    public void setType(String type) {
        this.type = type;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Filter [type=" + type + ", brand=" + brand + "]";
    }
    public void apply() {
        System.out.println("Applying basic filter");
    }
}

