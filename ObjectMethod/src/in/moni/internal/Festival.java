package in.moni.internal;

public class Festival {
    private String name;
    private int days;

    public Festival(String name, int days) {
        this.name = name;
        this.days = days;
    }

    @Override
    public String toString() {
        return "Festival{name='" + name + "', days=" + days + "}";
    }
        public void celebrate() {
            System.out.println("Celebrating festival");
        }
    }


