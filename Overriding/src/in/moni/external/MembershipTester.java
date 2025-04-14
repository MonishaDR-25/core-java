package in.moni.external;

import in.moni.internal.Membership;

public class MembershipTester {
    public void testMembership(Membership membership) {
        if (membership != null) {
            membership.register();
            if (membership instanceof GymMembership) {
                GymMembership gym = (GymMembership) membership;
                gym.assignTrainer();
            } else {
                System.err.println("Not a gym membership");
            }
        } else {
            System.err.println("Membership is null");
        }
    }
}
