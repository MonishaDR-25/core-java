package in.moni.internal;

public class Book {
    String title;
    String author;

   public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return "Book[title=" + title + ", author=" + author + "]";
    }
    public void open() {

        System.out.println("Opening book");
    }
}

