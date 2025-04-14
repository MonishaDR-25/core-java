package in.moni.external;

import in.moni.internal.FestivalEvent;

public class FestivalEventTester {
    public void testEvent(FestivalEvent event) {
        if (event != null) {
            event.organize();
            if (event instanceof CulturalProgram) {
                CulturalProgram cultural = (CulturalProgram) event;
                cultural.inviteArtists();
            } else {
                System.err.println("Not cultural program");
            }
        } else {
            System.err.println("Event is null");
        }
    }
}
