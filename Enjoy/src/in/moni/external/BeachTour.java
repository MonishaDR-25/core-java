package in.moni.external;

import in.moni.internal.Beach;

public class BeachTour {
    public void visit() {
        Beach beach = new Beach();
        beach.swim();
        System.out.println("Tourists visiting beach");
    }
}
