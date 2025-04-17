package in.moni.internal;

public class Factory {
    private String location;
    private int workers;

    public Factory(String location, int workers) {
        this.location = location;
        this.workers = workers;
    }

    @Override
    public String toString() {
        return "Factory{location='" + location + "', workers=" + workers + "}";
    }
    public void manufacture() {
        System.out.println("Manufacturing products");
    }
}


