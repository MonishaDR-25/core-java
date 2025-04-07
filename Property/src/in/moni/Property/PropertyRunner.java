package in.moni.Property;

public class PropertyRunner {
    public static void main(String[] args) {
        // Creating Owner objects
        Owner owner1 = new Owner("Rahul", "Mumbai");
        Owner owner2 = new Owner("Neha", "Delhi");

        // Creating Property object
        Property property = new Property("Sunrise Apartments", 5000000, "Bangalore", new Owner[]{owner1, owner2});

        // Display Property details
        property.displayDetails();
    }
}
