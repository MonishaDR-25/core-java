package in.moni.external;

import in.moni.internal.Gadget;

public class Smartwatch extends Gadget {
    @Override
    public void use() {
        System.out.println("Wearing smartwatch");
    }

    public void trackSteps() {
        System.out.println("Tracking steps with smartwatch");
    }
}
