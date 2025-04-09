package in.moni.internal;

public class GymTracker {
    public void trackGym() {
        Gym gym = new Gym();

        System.out.println("\nInitial Gym Values:");
        System.out.println("Name: " + gym.getName());
        System.out.println("Members: " + gym.getMembers());
        System.out.println("24 Hours: " + gym.is24Hours());
        System.out.println("Monthly Fee: " + gym.getMonthlyFee());
        System.out.println("Location: " + gym.getLocation());

        gym.setName("Powerhouse Gym");
        gym.setMembers(1200);
        gym.setIs24Hours(true);
        gym.setMonthlyFee(79.99);
        gym.setLocation("Downtown");

        System.out.println("\nUpdated Gym Values:");
        System.out.println("Name: " + gym.getName());
        System.out.println("Members: " + gym.getMembers());
        System.out.println("24 Hours: " + gym.is24Hours());
        System.out.println("Monthly Fee: " + gym.getMonthlyFee());
        System.out.println("Location: " + gym.getLocation());
    }
}
