import in.moni.external.MutantResearch;
import in.moni.internal.MutantTracker;

public class MutantRunner {
    public static void main(String[] args) {
        MutantTracker tracker = new MutantTracker();
        tracker.trackMutant();

        MutantResearch research = new MutantResearch();
        research.studyMutant();
    }
}
