package in.moni.external;

import in.moni.internal.Booth;

public class BoothTester {
    public void testBooth(Booth booth) {
        if (booth != null) {
            booth.serve();
            if (booth instanceof VotingBooth) {
                VotingBooth voting = (VotingBooth) booth;
                voting.secureBallot();
            } else {
                System.err.println("Not voting booth");
            }
        } else {
            System.err.println("Booth is null");
        }
    }
}
