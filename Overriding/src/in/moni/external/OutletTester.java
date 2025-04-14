package in.moni.external;

import in.moni.internal.Outlet;

public class OutletTester {
    public void test(Outlet outlet) {
        if (outlet != null) {
            outlet.supplyPower();
            if (outlet instanceof SmartOutlet) {
                SmartOutlet smart = (SmartOutlet) outlet;
                smart.trackUsage();
            } else {
                System.err.println("Not a smart outlet");
            }
        } else {
            System.err.println("Outlet is null");
        }
    }
}
