package in.moni.internal;

public class Schedule {
    private String event;
    private String date;

    public void setEvent(String event) {
        this.event = event;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Schedule: " + event + ", Date: " + date;
    }
        public void update() {
            System.out.println("Updating schedule");
        }
    }


