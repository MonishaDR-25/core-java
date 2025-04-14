package in.moni.external;

import in.moni.internal.Order;

public class OrderTester {
    public void test(Order order) {
        if (order != null) {
            order.process();
            if (order instanceof OnlineOrder) {
                OnlineOrder online = (OnlineOrder) order;
                online.trackDeliveryStatus();
            } else {
                System.err.println("Not online order");
            }
        } else {
            System.err.println("Order is null");
        }
    }
}
