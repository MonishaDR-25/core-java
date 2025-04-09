package in.moni;

import in.moni.external.PostOfficeResearch;
import in.moni.internal.PostOfficeTracker;

public class PostOfficeRunner {
    public static void main(String[] args){

        PostOfficeTracker postOfficeTracker = new PostOfficeTracker();
        postOfficeTracker.trackPostOffice();
        PostOfficeResearch postOfficeResearch = new PostOfficeResearch();
        postOfficeResearch.studyPostOffice();
    }
}
