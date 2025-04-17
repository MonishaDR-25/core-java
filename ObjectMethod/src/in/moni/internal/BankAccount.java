package in.moni.internal;

public class BankAccount {
    private String bankName;
    private double balance;

    public BankAccount(String bankName, double balance) {
        this.bankName = bankName;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{bankName='" + bankName + "', balance=" + balance + "}";
    }
    public void access() {
        System.out.println("Accessing bank account");
    }
}


