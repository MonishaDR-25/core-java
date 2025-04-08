import in.moni.external.Decoration;
import in.moni.internal.BeachWalk;

public class ShellRunner {
    public static void main(String[] args) {
        BeachWalk walk = new BeachWalk();
        walk.explore();
        System.out.println("Beach walk completed");

        Decoration decor = new Decoration();
        decor.decorate();
        System.out.println("Decoration done with shells");
    }
}
