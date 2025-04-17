package in.moni.internal;

public class TicketMachine {
    private String location;
    private String type;

    public void setLocation(String location) {
        this.location = location;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "TicketMachine at: " + location + ", Type: " + type;
    }
        public void issueTicket() {
            System.out.println("Issuing generic ticket");
        }
    }


