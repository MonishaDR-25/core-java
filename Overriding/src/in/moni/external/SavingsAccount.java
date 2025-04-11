package in.moni.external;

import in.moni.internal.Account;

public class SavingsAccount extends Account {
    @Override
    public void access() {
        System.out.println("Accessing savings account");
    }

    public void calculateInterest() {
        System.out.println("Calculating savings interest");
    }
}
