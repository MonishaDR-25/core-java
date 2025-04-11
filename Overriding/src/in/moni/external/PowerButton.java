package in.moni.external;

import in.moni.internal.Button;

public class PowerButton extends Button {
    @Override
    public void press() {
        System.out.println("Power button pressed");
    }

    public void bootSystem() {
        System.out.println("Booting system with power button");
    }
}
