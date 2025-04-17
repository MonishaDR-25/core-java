package in.moni.internal;

public class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person: " + name + ", Age: " + age;
    }
    public void work() {
        System.out.println("Person working");
    }
}
