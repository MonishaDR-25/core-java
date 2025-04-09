package in.moni.internal;

public class Occupation {
    private String title = "Software Engineer";
    private int yearsExperience = 5;
    private boolean isFullTime = true;
    private double salary = 85000.0;
    private String industry = "Technology";

    // Setters
    void setTitle(String title) {
        this.title = title;
    }
    void setYearsExperience(int yearsExperience) {
        this.yearsExperience = yearsExperience;
    }
    void setIsFullTime(boolean isFullTime) {
        this.isFullTime = isFullTime;
    }
    void setSalary(double salary) {
        this.salary = salary;
    }
    void setIndustry(String industry) {
        this.industry = industry;
    }

    // Getters
    public String getTitle() {
        return title;
    }
    public int getYearsExperience() {
        return yearsExperience;
    }
    public boolean isFullTime() {
        return isFullTime;
    }
    public double getSalary() {
        return salary;
    }
    public String getIndustry() {
        return industry;
    }
}
