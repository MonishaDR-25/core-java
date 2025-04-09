import in.moni.external.GarageResearch;
import in.moni.internal.GarageTracker;

public class GarageRunner {
    public static void main(String[] args){

        GarageTracker garageTracker = new GarageTracker();
        garageTracker.trackGarage();

        GarageResearch garageResearch = new GarageResearch();
        garageResearch.studyGarage();
    }
}
