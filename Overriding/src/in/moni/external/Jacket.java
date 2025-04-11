package in.moni.external;

import in.moni.internal.Cloth;

public class Jacket extends Cloth {
    @Override
    public void wear() {
        System.out.println("Wearing jacket");
    }

    public void zipUp() {
        System.out.println("Zipping up jacket");
    }
}
