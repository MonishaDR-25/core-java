package in.moni.internal;

public class Food {
    private String name;
    private boolean isVegetarian;

    public void setName(String name) {
        this.name = name;
    }

    public void setIsVegetarian(boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
    }

    @Override
    public String toString() {
        return "Food [name=" + name + ", isVegetarian=" + isVegetarian + "]";
    }
    public void prepare() {

        System.out.println("Preparing food");
    }
}

