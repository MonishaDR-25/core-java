package in.moni.internal;

public class LibraryCard {
    private String cardNumber;
    private int borrowedBooks;

    public LibraryCard(String cardNumber, int borrowedBooks) {
        this.cardNumber = cardNumber;
        this.borrowedBooks = borrowedBooks;
    }

    @Override
    public String toString() {
        return "LibraryCard{cardNumber='" + cardNumber + "', borrowedBooks=" + borrowedBooks + "}";
    }
    public void scan() {
        System.out.println("Scanning library card");
    }
}


