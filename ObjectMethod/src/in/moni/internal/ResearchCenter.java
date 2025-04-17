package in.moni.internal;

public class ResearchCenter {
    private String name;
    private int scientists;

    public ResearchCenter(String name, int scientists) {
        this.name = name;
        this.scientists = scientists;
    }

    @Override
    public String toString() {
        return "ResearchCenter{name='" + name + "', scientists=" + scientists + "}";
    }
    public void analyze() {
        System.out.println("Analyzing research data");
    }
}

