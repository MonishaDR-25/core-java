package in.moni.internal;

public class PostOfficeTracker {
    public void trackPostOffice() {
        PostOffice postOffice = new PostOffice();

        System.out.println("\nInitial PostOffice Values:");
        System.out.println("Name: " + postOffice.getName());
        System.out.println("Employees: " + postOffice.getNumberOfEmployees());
        System.out.println("Open: " + postOffice.isOpen());
        System.out.println("Daily Letters: " + postOffice.getDailyLetters());
        System.out.println("Location: " + postOffice.getLocation());

        postOffice.setName("Central Post");
        postOffice.setNumberOfEmployees(25);
        postOffice.setIsOpen(false);
        postOffice.setDailyLetters(750.8);
        postOffice.setLocation("Midtown");

        System.out.println("\nUpdated PostOffice Values:");
        System.out.println("Name: " + postOffice.getName());
        System.out.println("Employees: " + postOffice.getNumberOfEmployees());
        System.out.println("Open: " + postOffice.isOpen());
        System.out.println("Daily Letters: " + postOffice.getDailyLetters());
        System.out.println("Location: " + postOffice.getLocation());
    }
}
