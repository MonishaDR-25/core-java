package Sweet;

public class SweetRunner {
    public static void main(String[] args) {
        Sweet sweet = new Sweet();
        Dessert dessert = new Dessert(sweet);
        dessert.serve();
    }
}
