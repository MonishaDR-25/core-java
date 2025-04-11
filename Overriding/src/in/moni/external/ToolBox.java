package in.moni.external;

import in.moni.internal.Box;

public class ToolBox extends Box {
    @Override
    public void store() {
        System.out.println("Toolbox storing tools");
    }

    public void lock() {
        System.out.println("Locking toolbox");
    }
}
