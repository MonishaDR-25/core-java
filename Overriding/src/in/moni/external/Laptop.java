package in.moni.external;

import in.moni.internal.Computer;

public class Laptop extends Computer {
    @Override
    public void process() {
        System.out.println("Laptop computing");
    }

    public void foldScreen() {
        System.out.println("Laptop screen folding");
    }
}
