package in.moni.external;

import in.moni.internal.Wallet;

public class DigitalWallet extends Wallet {
    @Override
    public void pay() {
        System.out.println("Making digital payment");
    }

    public void scanQRCode() {
        System.out.println("Scanning QR code");
    }
}
