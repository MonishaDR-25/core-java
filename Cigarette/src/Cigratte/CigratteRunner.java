package Cigratte;

public class CigratteRunner {
    public static void main(String[] args) {
        Cigratte cig = new Cigratte();
        Ashtray tray = new Ashtray(cig);
        tray.collectAsh();
    }
}
