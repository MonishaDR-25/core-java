package in.moni.internal;

public class Routine {
    private String activity;
    private int time;

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Routine: " + activity + ", Time: " + time;
    }
    public void action() {
        System.out.println("Following routine");
    }
}

