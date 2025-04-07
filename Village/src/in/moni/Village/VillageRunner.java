package in.moni.Village;

public class VillageRunner {
    public static void main(String[] args) {
        // Creating Resident objects
        Resident resident1 = new Resident("chandra", 45);
        Resident resident2 = new Resident("Sunita", 38);

        // Creating Village object
        Village village = new Village("bangarpet", 5000, "kolar", new Resident[]{resident1, resident2});

        // Display Village details
        village.displayDetails();
    }
}
