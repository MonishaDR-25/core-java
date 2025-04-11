package in.moni.external;

import in.moni.internal.Advertisement;

public class VideoAd extends Advertisement {
    @Override
    public void display() {
        System.out.println("Playing video ad");
    }

    public void trackViews() {
        System.out.println("Tracking video views");
    }
}
