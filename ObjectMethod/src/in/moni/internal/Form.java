package in.moni.internal;

public class Form {
    private String formType;
    private int fields;

    public Form(String formType, int fields) {
        this.formType = formType;
        this.fields = fields;
    }

    @Override
    public String toString() {
        return "Form{formType='" + formType + "', fields=" + fields + "}";
    }
    public void submit() {
        System.out.println("Submitting form");
    }
}

