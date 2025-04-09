package in.moni.internal;

public class ApartmentTracker {
    public void trackApartment() {
        Apartment apartment = new Apartment();

        System.out.println("\nInitial Apartment Values:");
        System.out.println("Complex: " + apartment.getComplexName());
        System.out.println("Unit #: " + apartment.getUnitNumber());
        System.out.println("Parking: " + apartment.hasParking());
        System.out.println("Rent: " + apartment.getRent());
        System.out.println("Location: " + apartment.getLocation());

        apartment.setComplexName("Urban Heights");
        apartment.setUnitNumber(505);
        apartment.setHasParking(false);
        apartment.setRent(1800.0);
        apartment.setLocation("City Center");

        System.out.println("\nUpdated Apartment Values:");
        System.out.println("Complex: " + apartment.getComplexName());
        System.out.println("Unit #: " + apartment.getUnitNumber());
        System.out.println("Parking: " + apartment.hasParking());
        System.out.println("Rent: " + apartment.getRent());
        System.out.println("Location: " + apartment.getLocation());
    }
}
