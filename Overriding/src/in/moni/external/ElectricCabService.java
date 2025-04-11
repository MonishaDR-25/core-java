package in.moni.external;

import in.moni.internal.CabService;

public class ElectricCabService extends CabService {
    @Override
    public void book() {
        System.out.println("Booking electric cab");
    }

    public void estimateCharge() {
        System.out.println("Estimating battery charge");
    }
}
