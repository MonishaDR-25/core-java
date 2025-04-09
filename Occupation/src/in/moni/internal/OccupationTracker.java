package in.moni.internal;

public class OccupationTracker {
    public void trackOccupation() {
        Occupation occupation = new Occupation();

        System.out.println("\nInitial Occupation Values:");
        System.out.println("Title: " + occupation.getTitle());
        System.out.println("Experience: " + occupation.getYearsExperience());
        System.out.println("Full Time: " + occupation.isFullTime());
        System.out.println("Salary: " + occupation.getSalary());
        System.out.println("Industry: " + occupation.getIndustry());

        occupation.setTitle("Senior Developer");
        occupation.setYearsExperience(8);
        occupation.setIsFullTime(false);
        occupation.setSalary(105000.0);
        occupation.setIndustry("Finance");

        System.out.println("\nUpdated Occupation Values:");
        System.out.println("Title: " + occupation.getTitle());
        System.out.println("Experience: " + occupation.getYearsExperience());
        System.out.println("Full Time: " + occupation.isFullTime());
        System.out.println("Salary: " + occupation.getSalary());
        System.out.println("Industry: " + occupation.getIndustry());
    }
}
