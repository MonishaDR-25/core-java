package in.moni.external;

import in.moni.internal.WaterSource;

public class WaterTester {
    public void testWater(WaterSource water) {
        if (water != null) {
            water.flow();
            if (water instanceof River) {
                River river = (River) water;
                river.supportFishing();
            } else {
                System.err.println("Not a river");
            }
        } else {
            System.err.println("Water source is null");
        }
    }
}
