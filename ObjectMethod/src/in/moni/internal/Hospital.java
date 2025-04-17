package in.moni.internal;

public class Hospital {
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
        return "Hospital [name=" + name + ", location=" + location + "]";
    }
    public void admit() {
        System.out.println("Admitting patient");
    }
}

