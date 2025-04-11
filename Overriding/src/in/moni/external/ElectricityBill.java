package in.moni.external;

import in.moni.internal.Bill;

public class ElectricityBill extends Bill {
    @Override
    public void generate() {
        System.out.println("Generating electricity bill");
    }

    public void applySubsidy() {
        System.out.println("Applying electricity subsidy");
    }
}
