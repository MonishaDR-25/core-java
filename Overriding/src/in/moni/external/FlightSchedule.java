package in.moni.external;

import in.moni.internal.Schedule;

public class FlightSchedule extends Schedule {
    @Override
    public void update() {
        System.out.println("Updating flight schedule");
    }

    public void rescheduleFlight() {
        System.out.println("Rescheduling flight");
    }
}
