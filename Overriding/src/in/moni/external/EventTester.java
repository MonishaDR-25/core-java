package in.moni.external;

import in.moni.internal.Event;

public class EventTester {
    public void testEvent(Event event) {
        if (event != null) {
            event.schedule();
            if (event instanceof WeddingEvent) {
                WeddingEvent wedding = (WeddingEvent) event;
                wedding.bookVenue();
            } else {
                System.err.println("Not wedding event");
            }
        } else {
            System.err.println("Event is null");
        }
    }
}
