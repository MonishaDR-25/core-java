package in.moni.internal;

public class Menu {
    private String mealType;
    private int items;

    public Menu(String mealType, int items) {
        this.mealType = mealType;
        this.items = items;
    }

    @Override
    public String toString() {
        return "Menu{mealType='" + mealType + "', items=" + items + "}";
    }
    public void display() {
        System.out.println("Displaying menu");
    }
}

