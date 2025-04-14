package in.moni.external;

import in.moni.internal.Wallet;

public class WalletTester {
    public void test(Wallet wallet) {
        if (wallet != null) {
            wallet.pay();
            if (wallet instanceof DigitalWallet) {
                DigitalWallet digital = (DigitalWallet) wallet;
                digital.scanQRCode();
            } else {
                System.err.println("Not a digital wallet");
            }
        } else {
            System.err.println("Wallet is null");
        }
    }
}
