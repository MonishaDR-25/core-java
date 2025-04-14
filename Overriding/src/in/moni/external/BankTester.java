package in.moni.external;

import in.moni.internal.BankAccount;

public class BankTester {
    public void test(BankAccount account) {
        if (account != null) {
            account.access();
            if (account instanceof FixedDepositAccount) {
                FixedDepositAccount fixed = (FixedDepositAccount) account;
                fixed.calculateMaturity();
            } else {
                System.err.println("Not fixed deposit account");
            }
        } else {
            System.err.println("Account is null");
        }
    }
}
