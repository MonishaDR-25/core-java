package in.moni.external;

import in.moni.internal.Battery;

public class BatteryTester {
    public void test(Battery battery) {
        if (battery != null) {
            battery.charge();
            if (battery instanceof LithiumBattery) {
                LithiumBattery lithium = (LithiumBattery) battery;
                lithium.showChargeLevel();
            } else {
                System.err.println("Not lithium battery");
            }
        } else {
            System.err.println("Battery is null");
        }
    }
}
