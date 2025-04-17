package in.moni.internal;

public class CabService {
    private String serviceName;
    private int fleetSize;

    public CabService(String serviceName, int fleetSize) {
        this.serviceName = serviceName;
        this.fleetSize = fleetSize;
    }

    @Override
    public String toString() {
        return "CabService{serviceName='" + serviceName + "', fleetSize=" + fleetSize + "}";
    }
    public void book() {
        System.out.println("Booking cab");
    }
}

