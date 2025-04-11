package in.moni.external;

import in.moni.internal.Festi;

public class Christmas extends Festi {
    @Override
    public void celebrate() {
        System.out.println("Celebrating Christmas");
    }

    public void decorateTree() {
        System.out.println("Decorating Christmas tree");
    }
}
