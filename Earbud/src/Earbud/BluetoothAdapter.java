package Earbud;
import java.util.Objects;

public class BluetoothAdapter {
    public BluetoothAdapter(Earbud earbud) {
        System.out.println("Bluetooth connected");
        if (Objects.nonNull(earbud)) {
            earbud.play();
        } else {
            System.out.println("No earbud connected");
        }
    }

    public void maintainConnection() {
        System.out.println("Maintaining connection");
    }
}
