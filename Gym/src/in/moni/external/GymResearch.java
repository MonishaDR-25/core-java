package in.moni.external;

import in.moni.internal.Gym;

public class GymResearch {
    public void studyGym() {
        Gym gym = new Gym();

        System.out.println("\nGym Analysis:");
        System.out.println("Gym Name: " + gym.getName());
        System.out.println("Member Count: " + gym.getMembers());
        System.out.println("Availability: " + (gym.is24Hours() ? "24/7" : "Limited Hours"));
        System.out.println("Membership Cost: $" + gym.getMonthlyFee());
        System.out.println("Area: " + gym.getLocation());
    }
}
