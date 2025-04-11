package in.moni.external;

import in.moni.internal.Furniture;

public class Chair extends Furniture {
    @Override
    public void assemble() {
        System.out.println("Chair assembled");
    }

    public void adjustHeight() {
        System.out.println("Adjusting chair height");
    }
}
