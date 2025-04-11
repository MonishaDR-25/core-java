package in.moni.external;

import in.moni.internal.Order;

public class OnlineOrder extends Order {
    @Override
    public void process() {
        System.out.println("Processing online order");
    }

    public void trackDeliveryStatus() {
        System.out.println("Tracking delivery");
    }
}
