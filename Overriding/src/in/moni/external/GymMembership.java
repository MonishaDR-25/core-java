package in.moni.external;

import in.moni.internal.Membership;

public class GymMembership extends Membership {
    @Override
    public void register() {
        System.out.println("Registering gym membership");
    }

    public void assignTrainer() {
        System.out.println("Assigning personal trainer");
    }
}
