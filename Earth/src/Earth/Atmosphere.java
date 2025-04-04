package Earth;
import java.util.Objects;

public class Atmosphere {
    public Atmosphere(Earth earth) {
        System.out.println("Atmosphere forming");
        if (Objects.nonNull(earth)) {
            earth.rotate();
        } else {
            System.out.println("No planet detected");
        }
    }

    public void generateOxygen() {
        System.out.println("Producing breathable air");
    }
}
