package in.moni.external;

import in.moni.internal.Menu;

public class MenuTester {
    public void test(Menu menu) {
        if (menu != null) {
            menu.display();
            if (menu instanceof RestaurantMenu) {
                RestaurantMenu restaurant = (RestaurantMenu) menu;
                restaurant.filterByCuisine();
            } else {
                System.err.println("Not restaurant menu");
            }
        } else {
            System.err.println("Menu is null");
        }
    }
}
