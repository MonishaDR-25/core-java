package in.moni.external;

import in.moni.internal.ResearchCenter;

public class ResearchTester {
    public void test(ResearchCenter research) {
        if (research != null) {
            research.analyze();
            if (research instanceof SpaceResearchCenter) {
                SpaceResearchCenter space = (SpaceResearchCenter) research;
                space.launchSatellite();
            } else {
                System.err.println("Not space research center");
            }
        } else {
            System.err.println("Research center is null");
        }
    }
}
