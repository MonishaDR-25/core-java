package in.moni.external;

import in.moni.internal.Schedule;

public class ScheduleTester {
    public void testSchedule(Schedule schedule) {
        if (schedule != null) {
            schedule.update();
            if (schedule instanceof FlightSchedule) {
                FlightSchedule flight = (FlightSchedule) schedule;
                flight.rescheduleFlight();
            } else {
                System.err.println("Not a flight schedule");
            }
        } else {
            System.err.println("Schedule is null");
        }
    }
}
