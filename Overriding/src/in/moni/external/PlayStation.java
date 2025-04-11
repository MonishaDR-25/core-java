package in.moni.external;

import in.moni.internal.GameConsole;

public class PlayStation extends GameConsole {
    @Override
    public void loadGame() {
        System.out.println("Loading PlayStation game");
    }

    public void connectToNetwork() {
        System.out.println("Connecting to PlayStation Network");
    }
}
