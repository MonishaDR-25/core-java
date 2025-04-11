package in.moni.external;

import in.moni.internal.Container;

public class FuelTank extends Container {
    @Override
    public void action() {
        System.out.println("Handling fuel tank");
    }

    public void storeFuel() {
        System.out.println("Storing fuel safely");
    }
}
