package in.moni.external;

import in.moni.internal.Pass;

public class MetroPass extends Pass {
    @Override
    public void action() {
        System.out.println("Validating metro pass");
    }

    public void scanAtGate() {
        System.out.println("Scanning pass at metro gate");
    }
}
