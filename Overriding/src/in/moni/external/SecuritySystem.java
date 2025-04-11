package in.moni.external;

import in.moni.internal.Systems;

public class SecuritySystem extends Systems {
    @Override
    public void start() {
        System.out.println("Starting security system");
    }

    public void detectIntrusion() {
        System.out.println("Detecting security intrusions");
    }

}
