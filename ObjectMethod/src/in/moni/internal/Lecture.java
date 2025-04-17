package in.moni.internal;

public class Lecture {
    private String topic;
    private int duration;

    public Lecture(String topic, int duration) {
        this.topic = topic;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Lecture{topic='" + topic + "', duration=" + duration + "}";
    }
    public void deliver() {
        System.out.println("Delivering lecture");
    }
}


