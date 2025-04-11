package in.moni.external;

import in.moni.internal.Parcel;

public class CourierParcel extends Parcel {
    @Override
    public void ship() {
        System.out.println("Shipping via courier");
    }

    public void trackDelivery() {
        System.out.println("Tracking courier delivery");
    }
}
