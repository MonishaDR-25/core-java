package in.moni.internal;

public class Election {
    private String region;
    private int year;

    public void setRegion(String region) {
        this.region = region;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Election [region=" + region + ", year=" + year + "]";
    }
    public void conduct() {
        System.out.println("Conducting election");
    }
}


