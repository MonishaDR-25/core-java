package in.moni.external;

import in.moni.internal.Jet;

public class JetResearch {
    public void studyJet() {
        Jet jet = new Jet();

        System.out.println("\nJet Analysis:");
        System.out.println("Model: " + jet.getModel());
        System.out.println("Passengers: " + jet.getPassengerCapacity());
        System.out.println("Ownership: " + jet.isPrivate());
        System.out.println("Cruise Speed: " + jet.getSpeed());
        System.out.println("Operator: " + jet.getAirline());
    }
}
