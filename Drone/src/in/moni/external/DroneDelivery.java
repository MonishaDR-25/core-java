package in.moni.external;

import in.moni.internal.Drone;

public class DroneDelivery {
    public void send() {
        Drone drone = new Drone();
        drone.fly();
        System.out.println("Sending drone delivery");
    }
}
