package in.moni.internal;

public class Tool {
    private String name;
    private String purpose;

    public void setName(String name) {
        this.name = name;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Override
    public String toString() {
        return "Tool: " + name + ", Purpose: " + purpose;
    }
    public void use() {

        System.out.println("Tool being used");
    }
}
