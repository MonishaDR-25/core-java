package in.moni.internal;

public class Outlet {
    private String socketId;
    private int voltage;

    public Outlet(String socketId, int voltage) {
        this.socketId = socketId;
        this.voltage = voltage;
    }

    @Override
    public String toString() {
        return "Outlet{socketId='" + socketId + "', voltage=" + voltage + "}";
    }
    public void supplyPower() {
        System.out.println("Supplying power");
    }
}


