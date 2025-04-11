package in.moni.external;

import in.moni.internal.Hospital;

public class ChildrenHospital extends Hospital {
    @Override
    public void admit() {
        System.out.println("Admitting child patient");
    }

    public void provideToys() {
        System.out.println("Providing toys to children");
    }

}
