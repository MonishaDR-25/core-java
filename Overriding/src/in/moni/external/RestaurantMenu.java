package in.moni.external;

import in.moni.internal.Menu;

public class RestaurantMenu extends Menu {
    @Override
    public void display() {
        System.out.println("Displaying restaurant menu");
    }

    public void filterByCuisine() {
        System.out.println("Filtering by cuisine type");
    }
}
