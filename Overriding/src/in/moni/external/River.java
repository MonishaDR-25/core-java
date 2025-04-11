package in.moni.external;

import in.moni.internal.WaterSource;

public class River extends WaterSource {
    @Override
    public void flow() {
        System.out.println("River flowing");
    }
    public void supportFishing() {
        System.out.println("Supporting fishing activities");
    }

}
