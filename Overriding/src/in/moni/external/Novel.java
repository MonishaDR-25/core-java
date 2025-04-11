package in.moni.external;

import in.moni.internal.Book;

public class Novel extends Book {
    @Override
    public void open() {
        System.out.println("Opening novel to first chapter");
    }

    public void readStory() {
        System.out.println("Reading novel's story");
    }
}
