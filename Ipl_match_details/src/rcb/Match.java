package rcb;

public class Match {
    public static void main(String[] args) {
        String input = "RCB will win the match";
        String[] words = input.split(" ");


        for (String word : words) {
            System.out.print(word.length() + " ");
        }
    }

}
