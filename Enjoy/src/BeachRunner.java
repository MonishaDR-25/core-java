import in.moni.external.BeachTour;
import in.moni.internal.BeachActivity;

public class BeachRunner {
    public static void main(String[] args) {
        BeachActivity activity = new BeachActivity();
        activity.enjoy();
        System.out.println("Beach activities completed");

        BeachTour tour = new BeachTour();
        tour.visit();
        System.out.println("Beach tour completed");
    }
}