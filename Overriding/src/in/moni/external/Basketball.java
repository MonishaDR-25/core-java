package in.moni.external;

import in.moni.internal.Ball;

public class Basketball extends Ball {
    @Override
    public void bounce() {
        System.out.println("Basketball bouncing high");
    }

    public void dribble() {
        System.out.println("Dribbling basketball");
    }
}
