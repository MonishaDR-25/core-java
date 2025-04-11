package in.moni.external;

import in.moni.internal.Plant;

public class Cactus extends Plant {
    @Override
    public void grow() {
        System.out.println("Cactus growing slowly");
    }

    public void storeWater() {
        System.out.println("Cactus storing water");
    }
}
