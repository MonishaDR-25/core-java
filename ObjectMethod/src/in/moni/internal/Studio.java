package in.moni.internal;

public class Studio {
    private String name;
    private int rooms;

    public Studio(String name, int rooms) {
        this.name = name;
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "Studio{name='" + name + "', rooms=" + rooms + "}";
    }
    public void record() {
        System.out.println("Recording in studio");
    }
}


