package in.moni.external;

import in.moni.internal.Workout;

public class WorkoutTester {
    public void test(Workout workout) {
        if (workout != null) {
            workout.start();
            if (workout instanceof YogaSession) {
                YogaSession yoga = (YogaSession) workout;
                yoga.playRelaxingMusic();
            } else {
                System.err.println("Not a yoga session");
            }
        } else {
            System.err.println("Workout is null");
        }
    }
}
