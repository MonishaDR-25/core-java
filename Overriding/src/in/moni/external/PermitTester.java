package in.moni.external;

import in.moni.internal.Permit;

public class PermitTester {
    public void testPermit(Permit permit) {
        if (permit != null) {
            permit.authorize();
            if (permit instanceof DrivingPermit) {
                DrivingPermit driving = (DrivingPermit) permit;
                driving.checkEligibility();
            } else {
                System.err.println("Not driving permit");
            }
        } else {
            System.err.println("Permit is null");
        }
    }
}
