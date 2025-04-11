package in.moni.external;

import in.moni.internal.FuelStation;

public class ElectricChargingStation extends FuelStation {
    @Override
    public void refill() {
        System.out.println("Charging electric vehicle");
    }

    public void chargeVehicle() {
        System.out.println("Initiating charging process");
    }
}
