package in.moni;

import in.moni.external.OccupationResearch;
import in.moni.internal.OccupationTracker;

public class OccupationRunner {
    public static  void main(String[] args){

        OccupationTracker occupationTracker = new OccupationTracker();
        occupationTracker.trackOccupation();

        OccupationResearch occupationResearch = new OccupationResearch();
        occupationResearch.studyOccupation();

    }
}
