package in.moni.external;

import in.moni.internal.Fan;

public class CeilingFan extends Fan {
    @Override
    public void rotate() {
        System.out.println("Ceiling fan rotating silently");
    }

    public void changeSpeed() {
        System.out.println("Changing ceiling fan speed");
    }
}
