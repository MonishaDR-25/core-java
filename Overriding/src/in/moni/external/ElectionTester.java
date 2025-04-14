package in.moni.external;

import in.moni.internal.Election;

public class ElectionTester {
    public void testElection(Election election) {
        if (election != null) {
            election.conduct();
            if (election instanceof PresidentialElection) {
                PresidentialElection pres = (PresidentialElection) election;
                pres.countVotes();
            } else {
                System.err.println("Not presidential election");
            }
        } else {
            System.err.println("Election is null");
        }
    }
}
