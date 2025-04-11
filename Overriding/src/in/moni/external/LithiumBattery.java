package in.moni.external;

import in.moni.internal.Battery;

public class LithiumBattery extends Battery {
    @Override
    public void charge() {
        System.out.println("Fast charging lithium battery");
    }

    public void showChargeLevel() {
        System.out.println("Displaying battery percentage");
    }
}
