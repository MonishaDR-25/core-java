
import in.moni.external.GymResearch;
import in.moni.internal.GymTracker;

public class GymRunner {
    public static  void main(String[] args){

        GymTracker gymTracker = new GymTracker();
        gymTracker.trackGym();

        GymResearch gymResearch = new GymResearch();
        gymResearch.studyGym();
    }
}
