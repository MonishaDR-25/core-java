package in.moni.internal;

public class Exhibit {
    private String name;
    private String category;

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Exhibit [name=" + name + ", category=" + category + "]";
    }
    public void action() {
        System.out.println("Displaying exhibit");
    }
}

