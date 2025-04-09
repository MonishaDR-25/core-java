import in.moni.external.TankResearch;
import in.moni.internal.TankTracker;

public class TankRunner {
    public static void main(String[] args){

        TankTracker tankTracker = new TankTracker();
        tankTracker.trackTank();

        TankResearch tankResearch = new TankResearch();
        tankResearch.studyTank();
    }
}
