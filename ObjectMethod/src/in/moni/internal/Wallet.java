package in.moni.internal;

public class Wallet {
    private String provider;
    private double balance;

    public Wallet(String provider, double balance) {
        this.provider = provider;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Wallet{provider='" + provider + "', balance=" + balance + "}";
    }
    public void pay() {
        System.out.println("Making payment");
    }
}

