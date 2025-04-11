package in.moni.external;

import in.moni.internal.Studio;

public class MusicStudio extends Studio {
    @Override
    public void record() {
        System.out.println("Recording music tracks");
    }

    public void mixTrack() {
        System.out.println("Mixing audio tracks");
    }
}
