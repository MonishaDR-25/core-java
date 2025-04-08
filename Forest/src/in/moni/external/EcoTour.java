package in.moni.external;

import in.moni.internal.Forest;

public class EcoTour {
    public void visit() {
        Forest forest = new Forest();
        forest.walk();
        System.out.println("Visiting forest on eco tour");
    }
}
