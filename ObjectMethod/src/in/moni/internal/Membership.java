package in.moni.internal;

public class Membership {
    private String type;
    private int duration;

    public void setType(String type) {
        this.type = type;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Membership [type=" + type + ", duration=" + duration + "]";
    }
    public void register() {
        System.out.println("Registering membership");
    }
}


