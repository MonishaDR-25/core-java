package in.moni.external;

import in.moni.internal.Bird;

public class Eagle extends Bird {
    @Override
    public void fly() {
        System.out.println("Eagle soars high");
    }

    public void hunt() {
        System.out.println("Eagle hunts prey");
    }
}
