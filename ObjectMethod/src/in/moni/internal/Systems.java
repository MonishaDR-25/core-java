package in.moni.internal;

public class Systems {
    private String name;
    private String version;

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "System: " + name + ", Version: " + version;
    }

    public void start() {
        System.out.println("Starting system");
    }
    }

