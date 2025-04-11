package in.moni.external;

import in.moni.internal.Machine;

public class Drill extends Machine {
    @Override
    public void run() {
        System.out.println("Drill rotating");
    }

    public void changeBit() {
        System.out.println("Changing drill bit");
    }
}
