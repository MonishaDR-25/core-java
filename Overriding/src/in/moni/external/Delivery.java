package in.moni.external;

import in.moni.internal.Service;

public class Delivery extends Service {
    @Override
    public void execute() {
        System.out.println("Delivery in progress");
    }

    public void trackOrder() {
        System.out.println("Tracking delivery order");
    }
}
