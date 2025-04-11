package in.moni.external;

import in.moni.internal.Booth;

public class VotingBooth extends Booth {
    @Override
    public void serve() {
        System.out.println("Serving voters");
    }

    public void secureBallot() {
        System.out.println("Securing ballot papers");
    }

}
