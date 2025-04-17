package in.moni.internal;

public class Workout {
    private String type;
    private int duration;

    public Workout(String type, int duration) {
        this.type = type;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Workout{type='" + type + "', duration=" + duration + "}";
    }
    public void start() {
        System.out.println("Starting workout");
    }
}


