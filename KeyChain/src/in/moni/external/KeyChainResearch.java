package in.moni.external;

import in.moni.internal.KeyChain;

public class KeyChainResearch {
    public void studyKeyChain() {
        KeyChain keyChain = new KeyChain();

        System.out.println("KeyChain Analysis:");
        System.out.println("Material Sample: " + keyChain.getKeyMaterial());
        System.out.println("Key Count: " + keyChain.getNumberOfKeys());
        System.out.println("Car Key Status: " + keyChain.isHasCarKey());
        System.out.println("Length Measurement: " + keyChain.getChainLength());
        System.out.println("Color Observation: " + keyChain.getColor());
    }
}
