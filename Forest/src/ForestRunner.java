import in.moni.external.EcoTour;
import in.moni.internal.Nature;

public class ForestRunner {
    public static void main(String[] args) {
        Nature nature = new Nature();
        nature.enjoy();
        System.out.println("Nature experience completed");

        EcoTour tour = new EcoTour();
        tour.visit();
        System.out.println("Eco tour finished");
    }
}
