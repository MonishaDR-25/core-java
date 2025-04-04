package Earbud;

public class EarbudRunner {
    public static void main(String[] args) {
        Earbud earbud = new Earbud();
        BluetoothAdapter adapter = new BluetoothAdapter(earbud);
        adapter.maintainConnection();
    }
}
