package in.moni;

import in.moni.external.CombUse;
import in.moni.internal.HairCare;

public class CombRunner {
    public static void main(String[] args) {
        HairCare care = new HairCare();
        care.style();
        System.out.println("Hair styling completed");

        CombUse use = new CombUse();
        use.groom();
        System.out.println("Grooming done with comb");
    }
}
