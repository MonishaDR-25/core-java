package in.moni.internal;

public class Event {
    private String type;
    private int attendees;

    public Event(String type, int attendees) {
        this.type = type;
        this.attendees = attendees;
    }

    @Override
    public String toString() {
        return "Event{type='" + type + "', attendees=" + attendees + "}";
    }
    public void schedule() {
        System.out.println("Scheduling event");
    }
}


