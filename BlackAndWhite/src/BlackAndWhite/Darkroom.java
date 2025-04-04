package BlackAndWhite;
import java.util.Objects;

public class Darkroom {
    public Darkroom(BlackAndWhite film) {
        System.out.println("Darkroom initialized");
        if (Objects.nonNull(film)) {
            film.expose();
        } else {
            System.out.println("No film inserted");
        }
    }

    public void develop() {
        System.out.println("Developing photograph");
    }

}
