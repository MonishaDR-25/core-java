package in.moni.internal;

public class KeyChainTracker {
    public void trackKeyChain() {
        KeyChain keyChain = new KeyChain();

        System.out.println("Initial KeyChain Values:");
        System.out.println("Material: " + keyChain.getKeyMaterial());
        System.out.println("Number of Keys: " + keyChain.getNumberOfKeys());
        System.out.println("Has Car Key: " + keyChain.isHasCarKey());
        System.out.println("Chain Length: " + keyChain.getChainLength());
        System.out.println("Color: " + keyChain.getColor());

        keyChain.setKeyMaterial("titanium");
        keyChain.setNumberOfKeys(5);
        keyChain.setHasCarKey(true);
        keyChain.setChainLength(15.2);
        keyChain.setColor("black");

        System.out.println("\nUpdated KeyChain Values:");
        System.out.println("Material: " + keyChain.getKeyMaterial());
        System.out.println("Number of Keys: " + keyChain.getNumberOfKeys());
        System.out.println("Has Car Key: " + keyChain.isHasCarKey());
        System.out.println("Chain Length: " + keyChain.getChainLength());
        System.out.println("Color: " + keyChain.getColor());
    }
}
