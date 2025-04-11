package in.moni.external;

import in.moni.internal.Currency;

public class CryptoCurrency extends Currency {
    @Override
    public void convert() {
        System.out.println("Converting cryptocurrency");
    }

    public void trackValue() {
        System.out.println("Tracking crypto value");
    }
}
