package in.moni;

import in.moni.external.KeyChainResearch;
import in.moni.internal.KeyChainTracker;

public class KeyChainRunner {
    public static void main(String[] args){
        KeyChainTracker tracker=new KeyChainTracker();
        tracker.trackKeyChain();

        KeyChainResearch research=new KeyChainResearch();
        research.studyKeyChain();
    }
}
