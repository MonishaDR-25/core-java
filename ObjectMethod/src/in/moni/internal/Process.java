package in.moni.internal;

public class Process {
    private int step;
    private String duration;

    public void setStep(int step) {
        this.step = step;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Process step: " + step + ", Duration: " + duration + " mins";
    }
    public void action() {
        System.out.println("Executing process");
    }
}

