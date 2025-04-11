package in.moni.external;

import in.moni.internal.Exhibit;

public class DinosaurExhibit extends Exhibit {
    @Override
    public void action() {
        System.out.println("Displaying dinosaur exhibit");
    }

    public void playRoarSound() {
        System.out.println("Playing dinosaur roar sound effect");
    }
}
