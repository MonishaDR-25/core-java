package in.moni.internal;

public class Garage {
    private String garageName;
    private int mechanics;

    public Garage(String garageName, int mechanics) {
        this.garageName = garageName;
        this.mechanics = mechanics;
    }

    @Override
    public String toString() {
        return "Garage{garageName='" + garageName + "', mechanics=" + mechanics + "}";
    }
    public void service() {
        System.out.println("Servicing vehicle");
    }
}


