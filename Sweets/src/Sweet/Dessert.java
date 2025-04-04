package Sweet;
import java.util.Objects;

public class Dessert {
    public Dessert(Sweet sweet) {
        System.out.println("running constructor in Dessert");
        if (Objects.nonNull(sweet)) {
            sweet.taste();
        } else {
            System.out.println("null values occurred");
        }
    }

    public void serve() {
        System.out.println("running in serve method in Dessert");
    }
}
