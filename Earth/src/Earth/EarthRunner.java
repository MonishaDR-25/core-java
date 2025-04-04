package Earth;

public class EarthRunner {
    public static void main(String[] args) {
        Earth earth = new Earth();
        Atmosphere atm = new Atmosphere(earth);
        atm.generateOxygen();
    }
}
