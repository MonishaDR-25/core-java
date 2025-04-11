package in.moni.external;

import in.moni.internal.TicketMachine;

public class TrainTicketMachine extends TicketMachine {
    @Override
    public void issueTicket() {
        System.out.println("Issuing train ticket");
    }

    public void showPlatformNumber() {
        System.out.println("Displaying platform number");
    }
}
