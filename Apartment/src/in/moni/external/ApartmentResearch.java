package in.moni.external;

import in.moni.internal.Apartment;

public class ApartmentResearch {
    public void studyApartment() {
        Apartment apartment = new Apartment();

        System.out.println("\nApartment Analysis:");
        System.out.println("Building: " + apartment.getComplexName());
        System.out.println("Apartment #: " + apartment.getUnitNumber());
        System.out.println("Parking Available: " + apartment.hasParking());
        System.out.println("Monthly Rent: $" + apartment.getRent());
        System.out.println("Neighborhood: " + apartment.getLocation());
    }
}
