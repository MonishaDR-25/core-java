package Liver;
import java.util.Objects;

public class BileDuct {
    public BileDuct(Liver liver) {
        System.out.println("Bile duct connected");
        if (Objects.nonNull(liver)) {
            liver.detox();
        } else {
            System.out.println("No liver present");
        }
    }

    public void transport() {
        System.out.println("Transporting bile");
    }
}
