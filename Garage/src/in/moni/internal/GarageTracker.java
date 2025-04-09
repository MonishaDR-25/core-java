package in.moni.internal;

public class GarageTracker {
    public void trackGarage() {
        Garage garage = new Garage();

        System.out.println("\nInitial Garage Values:");
        System.out.println("Type: " + garage.getType());
        System.out.println("Capacity: " + garage.getCapacity());
        System.out.println("Heated: " + garage.isHeated());
        System.out.println("Width: " + garage.getWidth());
        System.out.println("Door Type: " + garage.getDoorType());

        garage.setType("Commercial");
        garage.setCapacity(10);
        garage.setIsHeated(true);
        garage.setWidth(30.5);
        garage.setDoorType("Roll-up");

        System.out.println("\nUpdated Garage Values:");
        System.out.println("Type: " + garage.getType());
        System.out.println("Capacity: " + garage.getCapacity());
        System.out.println("Heated: " + garage.isHeated());
        System.out.println("Width: " + garage.getWidth());
        System.out.println("Door Type: " + garage.getDoorType());
    }
}
