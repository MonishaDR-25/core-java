package in.moni.external;

import in.moni.internal.Shop;

public class ShopTester {
    public void testShop(Shop shop) {
        if (shop != null) {
            shop.open();
            if (shop instanceof BookStore) {
                BookStore bookstore = (BookStore) shop;
                bookstore.listGenres();
            } else {
                System.err.println("Not a bookstore");
            }
        } else {
            System.err.println("Shop is null");
        }
    }
}
