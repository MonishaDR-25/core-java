package in.moni.external;

import in.moni.internal.Farm;

public class OrganicFarm extends Farm {
    @Override
    public void cultivate() {
        System.out.println("Cultivating organic crops");
    }

    public void addCompost() {
        System.out.println("Adding organic compost");
    }
}
