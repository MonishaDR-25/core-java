package in.moni.external;

import in.moni.internal.FestivalEvent;

public class CulturalProgram extends FestivalEvent {
    @Override
    public void organize() {
        System.out.println("Organizing cultural program");
    }

    public void inviteArtists() {
        System.out.println("Inviting performing artists");
    }

}
