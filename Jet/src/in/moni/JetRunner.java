package in.moni;

import in.moni.external.JetResearch;
import in.moni.internal.JetTracker;

public class JetRunner {
    public static void main(String[] args){

        JetTracker jetTracker = new JetTracker();
        jetTracker.trackJet();

        JetResearch jetResearch = new JetResearch();
        jetResearch.studyJet();

    }
}
