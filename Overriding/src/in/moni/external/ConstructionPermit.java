package in.moni.external;

import in.moni.internal.Permission;

public class ConstructionPermit extends Permission {
    @Override
    public void action() {
        System.out.println("Processing construction permit");
    }

    public void inspectSite() {
        System.out.println("Inspecting construction site");
    }
}
