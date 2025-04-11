package in.moni.external;

import in.moni.internal.Contract;

public class EmploymentContract extends Contract {
    @Override
    public void sign() {
        System.out.println("Signing employment contract");
    }

    public void assignRole() {
        System.out.println("Assigning employee role");
    }
}
