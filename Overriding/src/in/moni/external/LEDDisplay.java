package in.moni.external;

import in.moni.internal.Display;

public class LEDDisplay extends Display {
    @Override
    public void show() {
        System.out.println("LED display showing bright content");
    }

    public void adjustBrightness() {
        System.out.println("Adjusting LED brightness");
    }
}
