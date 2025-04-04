package Kidney;
import java.util.Objects;

public class Nephron {
    public Nephron(Kidney kidney) {
        System.out.println("Nephron created");
        if (Objects.nonNull(kidney)) {
            kidney.filter();
        } else {
            System.out.println("No kidney present");
        }
    }

    public void process() {
        System.out.println("Processing waste");
    }
}
