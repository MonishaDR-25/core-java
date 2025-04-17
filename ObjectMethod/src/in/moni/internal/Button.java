package in.moni.internal;

public class Button {
    String label;
    boolean isEnabled;

   public Button(String label, boolean isEnabled) {
        this.label = label;
        this.isEnabled = isEnabled;
    }

    public String toString() {
        return "Button[label=" + label + ", isEnabled=" + isEnabled + "]";
    }
    public void press()
    {
        System.out.println("Button pressed");
    }
}

