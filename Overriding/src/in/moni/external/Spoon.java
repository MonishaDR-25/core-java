package in.moni.external;

import in.moni.internal.Utensil;

public class Spoon extends Utensil {
    @Override
    public void clean() {
        System.out.println("Polishing spoon");
    }

    public void scoop() {
        System.out.println("Scooping with spoon");
    }
}
