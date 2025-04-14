package in.moni.external;

import in.moni.internal.TicketMachine;

public class TicketTester {
    public void testMachine(TicketMachine machine) {
        if (machine != null) {
            machine.issueTicket();
            if (machine instanceof TrainTicketMachine) {
                TrainTicketMachine train = (TrainTicketMachine) machine;
                train.showPlatformNumber();
            } else {
                System.err.println("Not a train ticket machine");
            }
        } else {
            System.err.println("Machine is null");
        }
    }
}
