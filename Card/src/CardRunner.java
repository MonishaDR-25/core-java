import in.moni.external.Magic;
import in.moni.internal.Poker;

public class CardRunner {
    public static void main(String[] args) {
        Poker poker = new Poker();
        poker.play();
        System.out.println("Poker game over");

        Magic magic = new Magic();
        magic.trick();
        System.out.println("Magic trick done");
    }
}
