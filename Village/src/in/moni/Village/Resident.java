package in.moni.Village;

public class Resident {
    private String name;
    private int age;

    public Resident(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Resident Name: " + name + ", Age: " + age);
    }
}
