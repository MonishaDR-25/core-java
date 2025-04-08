package in.moni.internal;

public class CoinGame {
    public void play() {
        Coin coin = new Coin();
        coin.flip();
        coin.toss();
        System.out.println("Playing with coin");
    }
}
