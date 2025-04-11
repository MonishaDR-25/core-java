package in.moni.external;

import in.moni.internal.Garage;

public class BikeGarage extends Garage {
    @Override
    public void service() {
        System.out.println("Servicing bike");
    }

    public void inflateTires() {
        System.out.println("Inflating bike tires");
    }
}
