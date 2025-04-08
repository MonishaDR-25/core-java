package in.moni.internal;

    public class Poker {
        public void play() {
            Card card = new Card();
            card.deal();
            card.shuffle();
            System.out.println("Playing poker");
        }
}
