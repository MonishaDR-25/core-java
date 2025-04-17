package in.moni.internal;

public class Permission {
    private String user;
    private String level;

    public void setUser(String user) {
        this.user = user;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Permission for: " + user + ", level: " + level;
    }
    public void action() {
        System.out.println("Processing permit");
    }
}


