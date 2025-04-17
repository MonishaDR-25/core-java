package in.moni.internal;

public class Building {
    String name;
    int floors;

   public Building(String name, int floors) {
        this.name = name;
        this.floors = floors;
    }

    public String toString() {
        return "Building[name=" + name + ", floors=" + floors + "]";
    }
    public void construct() {

        System.out.println("Building constructed");
    }
}
