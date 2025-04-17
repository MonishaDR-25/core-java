package in.moni.internal;

public class ApplianceRemote {
    String version;
    int supportedDevices;

   public ApplianceRemote(String version, int supportedDevices) {
        this.version = version;
        this.supportedDevices = supportedDevices;
    }

    public String toString() {
        return "ApplicationRemote[version=" + version + ", supportedDevices=" + supportedDevices + "]";
    }
    public void control() {
        System.out.println("Controlling appliance");
    }
}

