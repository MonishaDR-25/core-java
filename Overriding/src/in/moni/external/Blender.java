package in.moni.external;

import in.moni.internal.Appliance;

public class Blender extends Appliance {
    @Override
    public void start() {
        System.out.println("Blender blades spinning");
    }

    public void blendFruits() {
        System.out.println("Blending fruits into smoothie");
    }
}
