package in.moni.internal;

public class Cook {
    public void bake() {
        Powder powder = new Powder();
        powder.apply();
        powder.mix();
        System.out.println("Baking with powder");
    }
}
