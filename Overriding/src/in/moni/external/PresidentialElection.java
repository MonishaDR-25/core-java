package in.moni.external;

import in.moni.internal.Election;

public class PresidentialElection extends Election {
    @Override
    public void conduct() {
        System.out.println("Conducting presidential election");
    }

    public void countVotes() {
        System.out.println("Counting presidential votes");
    }
}
