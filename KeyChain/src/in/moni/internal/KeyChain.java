package in.moni.internal;

public class KeyChain {
    private String keyMaterial = "metal";
    private int numberOfKeys = 3;
    private boolean hasCarKey = false;
    private double chainLength = 12.5;
    private String color = "silver";

    // Setters
    void setKeyMaterial(String keyMaterial) {
        this.keyMaterial = keyMaterial;
    }
    void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }
    void setHasCarKey(boolean hasCarKey) {
        this.hasCarKey = hasCarKey;
    }
    void setChainLength(double chainLength) {
        this.chainLength = chainLength;
    }
    void setColor(String color) {
        this.color = color;
    }

    // Getters
    public String getKeyMaterial() {
        return keyMaterial;
    }
    public int getNumberOfKeys() {
        return numberOfKeys;
    }
    public boolean isHasCarKey() {
        return hasCarKey;
    }
    public double getChainLength() {
        return chainLength;
    }
    public String getColor() {
        return color;
    }
}
