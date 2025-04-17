package in.moni.internal;

public class Toy {
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
        return "Toy: " + name + ", Category: " + category;
    }
    public void play() {

        System.out.println("Toy being played with");
    }
}

