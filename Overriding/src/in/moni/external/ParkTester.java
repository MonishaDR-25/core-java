package in.moni.external;

import in.moni.internal.Park;

public class ParkTester {
    public void test(Park park) {
        if (park != null) {
            park.maintain();
            if (park instanceof NationalPark) {
                NationalPark national = (NationalPark) park;
                national.protectWildlife();
            } else {
                System.err.println("Not a national park");
            }
        } else {
            System.err.println("Park is null");
        }
    }
}
