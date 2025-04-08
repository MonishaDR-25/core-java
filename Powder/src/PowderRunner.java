import in.moni.external.Makeup;
import in.moni.internal.Cook;

public class PowderRunner {
    public static void main(String[] args) {
        Cook cook = new Cook();
        cook.bake();
        System.out.println("Baking completed with powder");

        Makeup makeup = new Makeup();
        makeup.doMakeup();
        System.out.println("Makeup done with powder");
    }

}
