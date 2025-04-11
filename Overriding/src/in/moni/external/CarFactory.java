package in.moni.external;

import in.moni.internal.Factory;

public class CarFactory extends Factory {
    @Override
    public void manufacture() {
        System.out.println("Manufacturing cars");
    }

    public void paintVehicle() {
        System.out.println("Painting vehicles");
    }
}
