package in.moni.external;

import in.moni.internal.Toy;

public class Doll extends Toy {
    @Override
    public void play() {
        System.out.println("Playing with doll");
    }

    public void changeClothes() {
        System.out.println("Changing doll's clothes");
    }
}
