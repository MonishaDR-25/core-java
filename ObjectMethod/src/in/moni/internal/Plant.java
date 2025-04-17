package in.moni.internal;

public class Plant {
    private String species;
    private String location;

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Plant species: " + species + ", Location: " + location;
    }
    public void grow() {
        System.out.println("Plant growing");
    }
}


