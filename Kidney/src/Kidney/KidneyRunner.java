package Kidney;

public class KidneyRunner {
    public static void main(String[] args) {
        Kidney kidney = new Kidney();
        Nephron nephron = new Nephron(kidney);
        nephron.process();
    }
}
