import in.moni.external.Gift;
import in.moni.internal.Fragrance;

public class PerfumeRunner {
    public static void main(String[] args) {
        Fragrance fragrance = new Fragrance();
        fragrance.wear();
        System.out.println("Fragrance applied");

        Gift gift = new Gift();
        gift.give();
        System.out.println("Perfume gifted");
    }
}
