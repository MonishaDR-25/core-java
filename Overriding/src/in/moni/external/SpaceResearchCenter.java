package in.moni.external;

import in.moni.internal.ResearchCenter;

public class SpaceResearchCenter extends ResearchCenter {
    @Override
    public void analyze() {
        System.out.println("Analyzing space data");
    }

    public void launchSatellite() {
        System.out.println("Launching satellite");
    }
}
