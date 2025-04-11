package in.moni.external;

import in.moni.internal.Zoo;

public class BirdSanctuary extends Zoo {
    @Override
    public void displayAnimals() {
        System.out.println("Displaying birds in sanctuary");
    }

    public void feedBirds() {
        System.out.println("Feeding the birds");
    }
}
