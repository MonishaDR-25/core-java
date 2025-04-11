package in.moni.external;

import in.moni.internal.Food;

public class Pizza extends Food {
    @Override
    public void prepare() {
        System.out.println("Preparing pizza dough");
    }

    public void addToppings() {
        System.out.println("Adding pizza toppings");
    }

}
