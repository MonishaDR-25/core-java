import in.moni.external.CoinPay;
import in.moni.internal.CoinGame;

public class CoinRunner {
    public static void main(String[] args) {
        CoinGame game = new CoinGame();
        game.play();
        System.out.println("Coin game over");

        CoinPay pay = new CoinPay();
        pay.use();
        System.out.println("Payment done with coin");
    }
}
