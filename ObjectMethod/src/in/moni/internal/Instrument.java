package in.moni.internal;

public class Instrument {
    private String type;
    private String material;

    public void setType(String type) {
        this.type = type;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Instrument [type=" + type + ", material=" + material + "]";
    }
    public void play() {

        System.out.println("Instrument plays");
    }
}
