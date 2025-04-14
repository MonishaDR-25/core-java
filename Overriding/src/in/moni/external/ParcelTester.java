package in.moni.external;

import in.moni.internal.Parcel;

public class ParcelTester {
    public void testParcel(Parcel parcel) {
        if (parcel != null) {
            parcel.ship();
            if (parcel instanceof CourierParcel) {
                CourierParcel courier = (CourierParcel) parcel;
                courier.trackDelivery();
            } else {
                System.err.println("Not courier parcel");
            }
        } else {
            System.err.println("Parcel is null");
        }
    }
}
