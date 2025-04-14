package in.moni.external;

import in.moni.internal.Bill;

public class BillTester {
    public void test(Bill bill) {
        if (bill != null) {
            bill.generate();
            if (bill instanceof ElectricityBill) {
                ElectricityBill electric = (ElectricityBill) bill;
                electric.applySubsidy();
            } else {
                System.err.println("Not electricity bill");
            }
        } else {
            System.err.println("Bill is null");
        }
    }
}
