package in.moni.internal;

public class Connection {
    private String connectionType;
    private int speed;

    public Connection(String connectionType, int speed) {
        this.connectionType = connectionType;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Connection{connectionType='" + connectionType + "', speed=" + speed + "}";
    }
    public void establish() {

        System.out.println("Establishing connection");
    }
}

