package in.moni.internal;

public class Service {
    private String provider;
    private String type;

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Service provider: " + provider + ", Type: " + type;
    }
    public void execute() {

        System.out.println("Service executing");
    }
}


