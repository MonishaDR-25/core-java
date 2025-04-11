package in.moni.external;

import in.moni.internal.Outlet;

public class SmartOutlet extends Outlet {
    @Override
    public void supplyPower() {
        System.out.println("Smart power supply");
    }

    public void trackUsage() {
        System.out.println("Tracking energy usage");
    }
}
