package in.moni.external;

import in.moni.internal.Connection;

public class InternetConnection extends Connection {
    @Override
    public void establish() {
        System.out.println("Establishing internet connection");
    }

    public void checkSpeed() {
        System.out.println("Checking internet speed");
    }
}
