package in.moni.external;

import in.moni.internal.Bag;

public class Backpack extends Bag {
    @Override
    public void carry() {
        System.out.println("Backpack carrying books");
    }

    public void addBook() {
        System.out.println("Adding book to backpack");
    }

}
