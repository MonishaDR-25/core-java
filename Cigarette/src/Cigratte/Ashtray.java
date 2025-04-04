package Cigratte;
import java.util.Objects;

public class Ashtray {
    public Ashtray(Cigratte cig) {
        System.out.println("Ashtray ready");
        if (Objects.nonNull(cig)) {
            cig.burn();
        } else {
            System.out.println("No cigarette present");
        }
    }

    public void collectAsh() {
        System.out.println("Collecting ashes");
    }
}
