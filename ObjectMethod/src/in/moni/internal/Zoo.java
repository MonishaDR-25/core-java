package in.moni.internal;

public class Zoo {
    private String name;
    private int animals;

    public Zoo(String name, int animals) {
        this.name = name;
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "Zoo{name='" + name + "', animals=" + animals + "}";
    }
    public void displayAnimals() {
        System.out.println("Displaying zoo animals");
    }
}


