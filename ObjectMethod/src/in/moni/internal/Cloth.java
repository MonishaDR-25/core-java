package in.moni.internal;

public class Cloth {
    String fabric;
    String size;

  public Cloth(String fabric, String size) {
        this.fabric = fabric;
        this.size = size;
    }

    public String toString() {
        return "Cloth[fabric=" + fabric + ", size=" + size + "]";
    }
    public void wear() {

        System.out.println("Wearing cloth");
    }
}

