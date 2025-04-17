package in.moni.internal;

public class Museum {
    private String name;
    private String city;

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Museum [name=" + name + ", city=" + city + "]";
    }
    public void displayArtifacts() {
        System.out.println("Displaying museum artifacts");
    }
}


