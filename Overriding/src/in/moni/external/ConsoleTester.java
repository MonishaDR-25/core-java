package in.moni.external;

import in.moni.internal.GameConsole;

public class ConsoleTester {
    public void testConsole(GameConsole console) {
        if (console != null) {
            console.loadGame();
            if (console instanceof PlayStation) {
                PlayStation ps = (PlayStation) console;
                ps.connectToNetwork();
            } else {
                System.err.println("Not PlayStation");
            }
        } else {
            System.err.println("Console is null");
        }
    }
}
