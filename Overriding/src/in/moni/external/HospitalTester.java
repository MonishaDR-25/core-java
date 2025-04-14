package in.moni.external;

import in.moni.internal.Hospital;

public class HospitalTester {
    public void testHospital(Hospital hospital) {
        if (hospital != null) {
            hospital.admit();
            if (hospital instanceof ChildrenHospital) {
                ChildrenHospital children = (ChildrenHospital) hospital;
                children.provideToys();
            } else {
                System.err.println("Not children hospital");
            }
        } else {
            System.err.println("Hospital is null");
        }
    }
}
