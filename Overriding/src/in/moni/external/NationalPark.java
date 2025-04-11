package in.moni.external;

import in.moni.internal.Park;

public class NationalPark extends Park {
    @Override
    public void maintain() {
        System.out.println("Maintaining national park");
    }

    public void protectWildlife() {
        System.out.println("Protecting wildlife");
    }

}
