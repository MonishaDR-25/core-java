package Umbrella;
import java.util.Objects;

public class Rainstorm {
    public Rainstorm(Umbrella umbrella) {
        System.out.println("Rainstorm approaching");
        if (Objects.nonNull(umbrella)) {
            umbrella.protect();
        } else {
            System.out.println("Getting wet");
        }
    }

    public void pour() {
        System.out.println("Heavy rainfall");
    }
}
