package in.moni.internal;

public class Pass {
    private String type;
    private String validity;

    public void setType(String type) {
        this.type = type;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }

    @Override
    public String toString() {
        return "Pass type: " + type + ", validity: " + validity;
    }
    public void action() {
        System.out.println("Validating pass");
    }
}

