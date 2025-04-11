package in.moni.external;

import in.moni.internal.Building;

public class Apartment extends Building {
    @Override
    public void construct() {
        System.out.println("Apartment building constructed");
    }

    public void installLift() {
        System.out.println("Installing lift in apartment");
    }
}
