package in.moni.external;

import in.moni.internal.PostOffice;

public class PostOfficeResearch {
    public void studyPostOffice() {
        PostOffice postOffice = new PostOffice();

        System.out.println("\nPostOffice Analysis:");
        System.out.println("Name: " + postOffice.getName());
        System.out.println("Staff: " + postOffice.getNumberOfEmployees());
        System.out.println("Status: " + postOffice.isOpen());
        System.out.println("Mail Volume: " + postOffice.getDailyLetters());
        System.out.println("Area: " + postOffice.getLocation());
    }
}
