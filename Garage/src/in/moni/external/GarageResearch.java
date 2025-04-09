package in.moni.external;

import in.moni.internal.Garage;

public class GarageResearch {
    public void studyGarage() {
        Garage garage = new Garage();

        System.out.println("\nGarage Analysis:");
        System.out.println("Garage Type: " + garage.getType());
        System.out.println("Car Capacity: " + garage.getCapacity());
        System.out.println("Heating: " + garage.isHeated());
        System.out.println("Dimensions: " + garage.getWidth() + "ft wide");
        System.out.println("Entry System: " + garage.getDoorType());
    }
}
