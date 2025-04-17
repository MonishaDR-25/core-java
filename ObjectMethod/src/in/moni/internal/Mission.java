package in.moni.internal;

public class Mission {
    private String title;
    private int year;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Mission [title=" + title + ", year=" + year + "]";
    }
    public void action() {
        System.out.println("Executing mission");
    }
}


