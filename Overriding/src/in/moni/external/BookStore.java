package in.moni.external;

import in.moni.internal.Shop;

public class BookStore extends Shop {
    @Override
    public void open() {
        System.out.println("Opening bookstore");
    }

    public void listGenres() {
        System.out.println("Listing book genres");
    }
}
