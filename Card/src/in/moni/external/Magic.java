package in.moni.external;

import in.moni.internal.Card;

public class Magic {
    public void trick() {
        Card card = new Card();
        card.deal();
        System.out.println("Performing card trick");
    }
}
