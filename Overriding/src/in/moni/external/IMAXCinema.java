package in.moni.external;

import in.moni.internal.Cinema;

public class IMAXCinema extends Cinema {
    @Override
    public void screenMovie() {
        System.out.println("Screening IMAX movie");
    }

    public void adjustSurroundSound() {
        System.out.println("Adjusting surround sound system");
    }

}
