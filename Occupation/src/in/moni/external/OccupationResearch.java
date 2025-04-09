package in.moni.external;

import in.moni.internal.Occupation;

public class OccupationResearch {
    public void studyOccupation() {
        Occupation occupation = new Occupation();

        System.out.println("\nOccupation Analysis:");
        System.out.println("Job Title: " + occupation.getTitle());
        System.out.println("Years Exp: " + occupation.getYearsExperience());
        System.out.println("Employment Type: " + occupation.isFullTime());
        System.out.println("Annual Salary: " + occupation.getSalary());
        System.out.println("Sector: " + occupation.getIndustry());
    }
}
