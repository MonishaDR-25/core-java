package in.moni.external;

import in.moni.internal.Festival;

public class Diwali extends Festival {
    @Override
    public void celebrate() {
        System.out.println("Celebrating Diwali");
    }

    public void lightFirecrackers() {
        System.out.println("Lighting firecrackers");
    }
}
