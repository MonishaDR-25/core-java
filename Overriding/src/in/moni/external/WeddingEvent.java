package in.moni.external;

import in.moni.internal.Event;

public class WeddingEvent extends Event {
    @Override
    public void schedule() {
        System.out.println("Scheduling wedding events");
    }

    public void bookVenue() {
        System.out.println("Booking wedding venue");
    }
}
