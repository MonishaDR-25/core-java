package in.moni.internal;

public class Park {
    private String name;
    private int trees;

    public Park(String name, int trees) {
        this.name = name;
        this.trees = trees;
    }

    @Override
    public String toString() {
        return "Park{name='" + name + "', trees=" + trees + "}";
    }
    public void maintain() {
        System.out.println("Maintaining park");
    }
}

