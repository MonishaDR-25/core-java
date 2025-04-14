package in.moni.external;

import in.moni.internal.CabService;

public class CabTester {
    public void test(CabService cab) {
        if (cab != null) {
            cab.book();
            if (cab instanceof ElectricCabService) {
                ElectricCabService electric = (ElectricCabService) cab;
                electric.estimateCharge();
            } else {
                System.err.println("Not an electric cab");
            }
        } else {
            System.err.println("Cab is null");
        }
    }
}
