package in.moni.external;

import in.moni.internal.Toy;

public class RobotToy extends Toy {
    @Override
    public void play() {
        System.out.println("Robot toy activated");
    }

    public void walk() {
        System.out.println("Robot toy walking");
    }
}
