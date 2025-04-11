package in.moni.external;

import in.moni.internal.LibraryCard;

public class StudentLibraryCard extends LibraryCard {
    @Override
    public void scan() {
        System.out.println("Scanning student library card");
    }

    public void trackOverdueBooks() {
        System.out.println("Tracking overdue books");
    }
}
