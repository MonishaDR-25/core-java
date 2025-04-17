package in.moni.internal;

public class Alert {
    private String message;
    private int level;

    public Alert(String message, int level) {
        this.message = message;
        this.level = level;
    }

    @Override
    public String toString() {
        return "Alert{message='" + message + "', level=" + level + "}";
    }
    public void notice() {
        System.out.println("Sending alert");
    }
}


