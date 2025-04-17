package in.moni.internal;

public class Bird {
    String species;
    double wingspan;

   public Bird(String species, double wingspan) {
        this.species = species;
        this.wingspan = wingspan;
    }

    public String toString() {
        return "Bird[species=" + species + ", wingspan=" + wingspan + "]";
    }
    public void fly() {

        System.out.println("Bird is flying");
    }
}
