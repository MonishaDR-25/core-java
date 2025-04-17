package in.moni.internal;

public class Gadget {
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
        return "Gadget [name=" + name + ", version=" + version + "]";
    }
    public void use() {

        System.out.println("Using gadget");
    }
}

