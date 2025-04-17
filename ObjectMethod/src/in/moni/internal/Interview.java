package in.moni.internal;

public class Interview {
    private String position;
    private int rounds;

    public Interview(String position, int rounds) {
        this.position = position;
        this.rounds = rounds;
    }

    @Override
    public String toString() {
        return "Interview{position='" + position + "', rounds=" + rounds + "}";
    }
    public void conduct() {
        System.out.println("Conducting interview");
    }
}


