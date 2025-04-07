package in.moni.Village;

public class Village {
    private String villageName;
    private int population;
    private String district;
    private Resident[] residents; // Array of Residents

    public Village(String villageName, int population, String district, Resident[] residents) {
        this.villageName = villageName;
        this.population = population;
        this.district = district;
        this.residents = residents;
    }

    public void displayDetails() {
        System.out.println("Village Name: " + villageName + ", Population: " + population + ", District: " + district);
        System.out.println("Residents: ");
        for (Resident r : residents) {  // Using for-each loop
            r.display();
        }
    }
}
