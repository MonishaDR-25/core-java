package in.moni.internal;

public class Festi {
    private String event;
    private String place;

    public void setEvent(String event) {
        this.event = event;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Festi [event=" + event + ", place=" + place + "]";
    }

        public void celebrate() {
            System.out.println("Celebrating festival");
        }
    }


