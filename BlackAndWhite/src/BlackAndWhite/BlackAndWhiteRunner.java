package BlackAndWhite;

public class BlackAndWhiteRunner {
    public static void main(String[] args) {
        BlackAndWhite film = new BlackAndWhite();
        Darkroom lab = new Darkroom(film);
        lab.develop();
    }
}
