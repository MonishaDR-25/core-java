package in.moni.external;

import in.moni.internal.Garage;

public class GarageTester {
    public void test(Garage garage) {
        if (garage != null) {
            garage.service();
            if (garage instanceof BikeGarage) {
                BikeGarage bike = (BikeGarage) garage;
                bike.inflateTires();
            } else {
                System.err.println("Not bike garage");
            }
        } else {
            System.err.println("Garage is null");
        }
    }
}
