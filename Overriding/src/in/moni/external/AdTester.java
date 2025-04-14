package in.moni.external;

import in.moni.internal.Advertisement;

public class AdTester {
    public void test(Advertisement ad) {
        if (ad != null) {
            ad.display();
            if (ad instanceof VideoAd) {
                VideoAd video = (VideoAd) ad;
                video.trackViews();
            } else {
                System.err.println("Not video ad");
            }
        } else {
            System.err.println("Ad is null");
        }
    }
}
