package in.moni.external;

import in.moni.internal.Vehicle;

public class Bicycle extends Vehicle {
    @Override
    public void move() {
        System.out.println("Bicycle pedaling forward");
    }

    public void ringBell() {
        System.out.println("Bicycle bell ringing");
    }

}
