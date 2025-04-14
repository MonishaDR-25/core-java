package in.moni.external;

import in.moni.internal.LibraryCard;

public class LibraryTester {
    public void test(LibraryCard card) {
        if (card != null) {
            card.scan();
            if (card instanceof StudentLibraryCard) {
                StudentLibraryCard student = (StudentLibraryCard) card;
                student.trackOverdueBooks();
            } else {
                System.err.println("Not student library card");
            }
        } else {
            System.err.println("Card is null");
        }
    }
}
