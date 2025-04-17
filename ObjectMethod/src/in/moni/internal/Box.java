package in.moni.internal;

public class Box {
    String shape;
    int volume;

   public Box(String shape, int volume) {
        this.shape = shape;
        this.volume = volume;
    }

    public String toString() {
        return "Box[shape=" + shape + ", volume=" + volume + "]";
    }
    public void store() {

        System.out.println("Box storing items");
    }
}


