package in.moni;

import in.moni.external.BadgeResearch;
import in.moni.internal.BadgeTracker;

public class BadgeRunner {
    public static void main(String[] args){
        BadgeTracker badgeTracker = new BadgeTracker();
        badgeTracker.trackBadge();

        BadgeResearch badgeResearch = new BadgeResearch();
        badgeResearch.studyBadge();
    }
}
