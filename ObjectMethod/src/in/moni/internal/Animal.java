package in.moni.internal;

public class Animal{
    String type;
    int age;

    public Animal(String type, int age) {
        this.type = type;
        this.age = age;
    }

    public String toString() {
        return "Animal[type=" + type + ", age=" + age + "]";
    }
    public void makeSound() {
        System.out.println("Animal makes sound");
    }
}
