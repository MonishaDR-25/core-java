package in.moni.external;

import in.moni.internal.BankAccount;

public class FixedDepositAccount extends BankAccount {
    @Override
    public void access() {
        System.out.println("Accessing fixed deposit account");
    }

    public void calculateMaturity() {
        System.out.println("Calculating maturity amount");
    }
}
