package in.moni.external;

import in.moni.internal.Connection;

public class ConnectionTester {
    public void test(Connection connection) {
        if (connection != null) {
            connection.establish();
            if (connection instanceof InternetConnection) {
                InternetConnection internet = (InternetConnection) connection;
                internet.checkSpeed();
            } else {
                System.err.println("Not internet connection");
            }
        } else {
            System.err.println("Connection is null");
        }
    }
}
