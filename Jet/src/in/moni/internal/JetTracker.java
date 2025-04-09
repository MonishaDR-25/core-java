package in.moni.internal;

public class JetTracker {
    public void trackJet() {
        Jet jet = new Jet();

        System.out.println("\nInitial Jet Values:");
        System.out.println("Model: " + jet.getModel());
        System.out.println("Capacity: " + jet.getPassengerCapacity());
        System.out.println("Private: " + jet.isPrivate());
        System.out.println("Speed: " + jet.getSpeed());
        System.out.println("Airline: " + jet.getAirline());

        jet.setModel("Gulfstream G650");
        jet.setPassengerCapacity(18);
        jet.setIsPrivate(true);
        jet.setSpeed(610.0);
        jet.setAirline("Private");

        System.out.println("\nUpdated Jet Values:");
        System.out.println("Model: " + jet.getModel());
        System.out.println("Capacity: " + jet.getPassengerCapacity());
        System.out.println("Private: " + jet.isPrivate());
        System.out.println("Speed: " + jet.getSpeed());
        System.out.println("Airline: " + jet.getAirline());
    }
}
