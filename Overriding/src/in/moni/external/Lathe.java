package in.moni.external;

import in.moni.internal.Machine;

public class Lathe extends Machine {
    @Override
    public void run() {
        System.out.println("Lathe machine operating");
    }

    public void cutMetal() {
        System.out.println("Lathe cutting metal");
    }
}
