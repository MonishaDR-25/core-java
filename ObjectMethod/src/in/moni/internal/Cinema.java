package in.moni.internal;

public class Cinema {
    private String name;
    private int capacity;

    public Cinema(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Cinema{name='" + name + "', capacity=" + capacity + "}";
    }
    public void screenMovie() {

        System.out.println("Screening movie");
    }
}


