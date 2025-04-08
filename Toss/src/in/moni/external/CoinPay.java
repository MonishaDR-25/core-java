package in.moni.external;

import in.moni.internal.Coin;

public class CoinPay {
    public void use() {
        Coin coin = new Coin();
        coin.flip();
        System.out.println("Using coin for payment");
    }
}
