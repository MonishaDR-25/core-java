package in.moni.external;

import in.moni.internal.FuelStation;

public class FuelTester {
    public void test(FuelStation station) {
        if (station != null) {
            station.refill();
            if (station instanceof ElectricChargingStation) {
                ElectricChargingStation electric = (ElectricChargingStation) station;
                electric.chargeVehicle();
            } else {
                System.err.println("Not charging station");
            }
        } else {
            System.err.println("Station is null");
        }
    }
}
