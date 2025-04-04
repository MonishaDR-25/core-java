package Umbrella;

public class UmbrellaRunner {
    public static void main(String[] args) {
        Umbrella umbrella = new Umbrella();
        Rainstorm storm = new Rainstorm(umbrella);
        storm.pour();
    }
}
