package in.moni.internal;

public class Machine {
    private String name;
    private int power;

    public void setName(String name) {
        this.name = name;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Machine [name=" + name + ", power=" + power + "]";
    }
    public void run() {

        System.out.println("Machine running");
    }
}
