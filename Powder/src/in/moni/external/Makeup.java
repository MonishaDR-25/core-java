package in.moni.external;

import in.moni.internal.Powder;

public class Makeup {
    public void doMakeup() {
        Powder powder = new Powder();
        powder.apply();
        System.out.println("Doing makeup with powder");
    }
}
