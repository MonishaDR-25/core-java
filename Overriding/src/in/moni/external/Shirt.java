package in.moni.external;

import in.moni.internal.Clothing;

public class Shirt extends Clothing {
    @Override
    public void wear() {
        System.out.println("Shirt being worn");
    }

    public void buttonUp() {
        System.out.println("Buttoning up shirt");
    }
}

