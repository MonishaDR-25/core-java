package in.moni.internal;

public class Utensil {
    private String type;
    private String material;

    public void setType(String type) {
        this.type = type;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Utensil type: " + type + ", Material: " + material;
    }
    public void clean() {

        System.out.println("Cleaning utensil");
    }
}


