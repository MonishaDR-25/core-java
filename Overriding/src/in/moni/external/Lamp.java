package in.moni.external;

import in.moni.internal.Light;

public class Lamp extends Light {
    @Override
    public void glow() {
        System.out.println("Lamp shining light");
    }

    public void changeBulb() {
        System.out.println("Changing lamp bulb");
    }
}
