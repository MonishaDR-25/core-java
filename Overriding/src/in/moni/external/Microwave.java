package in.moni.external;

import in.moni.internal.Appliances;

public class Microwave extends Appliances {
    @Override
    public void start() {
        System.out.println("Microwave started");
    }

    public void heatFood() {
        System.out.println("Heating food in microwave");
    }
}
