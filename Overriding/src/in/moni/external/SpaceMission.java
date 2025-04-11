package in.moni.external;

import in.moni.internal.Mission;

public class SpaceMission extends Mission {
    @Override
    public void action() {
        System.out.println("Executing space mission");
    }

    public void launchRocket() {
        System.out.println("Launching rocket into space");
    }
}
