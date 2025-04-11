package in.moni.external;

import in.moni.internal.Tool;

public class Hammer extends Tool {
    @Override
    public void use() {
        System.out.println("Hammer striking nail");
    }

    public void nailDown() {
        System.out.println("Hammer nailing down");
    }
}
