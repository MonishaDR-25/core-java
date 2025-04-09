import in.moni.external.ApartmentResearch;
import in.moni.internal.ApartmentTracker;

public class ApartmentRunner {
    public static  void main(String[] args){

        ApartmentTracker apartmentTracker = new ApartmentTracker();
        apartmentTracker.trackApartment();

        ApartmentResearch apartmentResearch = new ApartmentResearch();
        apartmentResearch.studyApartment();
    }
}
