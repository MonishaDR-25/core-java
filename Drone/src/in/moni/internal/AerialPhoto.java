package in.moni.internal;

public class AerialPhoto {
    public void capture() {
        Drone drone = new Drone();
        drone.fly();
        drone.click();
        System.out.println("Capturing aerial photos");
    }
}
