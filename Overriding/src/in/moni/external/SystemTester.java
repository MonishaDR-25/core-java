package in.moni.external;

import in.moni.internal.Systems;

public class SystemTester {
    public void testSystem(Systems system) {
        if (system != null) {
            system.start();
            if (system instanceof SecuritySystem) {
                SecuritySystem security = (SecuritySystem) system;
                security.detectIntrusion();
            } else {
                System.err.println("Not security system");
            }
        } else {
            System.err.println("System is null");
        }
    }
}
