package in.moni.external;

import in.moni.internal.Routine;

public class MorningRoutine extends Routine {
    @Override
    public void action() {
        System.out.println("Following morning routine");
    }

    public void makeCoffee() {
        System.out.println("Brewing morning coffee");
    }
}
