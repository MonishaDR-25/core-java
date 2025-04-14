package in.moni.external;

import in.moni.internal.Currency;

public class CurrencyTester {
    public void testCurrency(Currency currency) {
        if (currency != null) {
            currency.convert();
            if (currency instanceof CryptoCurrency) {
                CryptoCurrency crypto = (CryptoCurrency) currency;
                crypto.trackValue();
            } else {
                System.err.println("Not cryptocurrency");
            }
        } else {
            System.err.println("Currency is null");
        }
    }
}
