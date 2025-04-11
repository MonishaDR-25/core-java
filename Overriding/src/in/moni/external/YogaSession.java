package in.moni.external;

import in.moni.internal.Workout;

public class YogaSession extends Workout {
    @Override
    public void start() {
        System.out.println("Starting yoga session");
    }

    public void playRelaxingMusic() {
        System.out.println("Playing meditation music");
    }
}
