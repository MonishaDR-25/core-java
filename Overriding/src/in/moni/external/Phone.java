package in.moni.external;

import in.moni.internal.Device;

public class Phone extends Device {
    @Override
    public void operate() {
        System.out.println("Phone powered on");
    }

    public void makeCall() {
        System.out.println("Phone making call");
    }
}
