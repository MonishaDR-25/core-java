package in.moni.internal;

public class Shop {
    private String name;
    private String location;

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Shop: " + name + ", Location: " + location;
    }
    public void open() {
        System.out.println("Opening shop");
    }
}


