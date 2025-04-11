package in.moni.external;

import in.moni.internal.Instrument;

public class Guitar extends Instrument {
    @Override
    public void play() {
        System.out.println("Guitar strums");
    }

    public void tuneStrings() {
        System.out.println("Tuning guitar strings");
    }

}
