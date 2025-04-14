package in.moni.external;

import in.moni.internal.Cinema;

public class CinemaTester {
    public void test(Cinema cinema) {
        if (cinema != null) {
            cinema.screenMovie();
            if (cinema instanceof IMAXCinema) {
                IMAXCinema imax = (IMAXCinema) cinema;
                imax.adjustSurroundSound();
            } else {
                System.err.println("Not IMAX cinema");
            }
        } else {
            System.err.println("Cinema is null");
        }
    }
}
