package rcb;

public class Upper {
    public static void main(String[] args) {
        String input = "hello how are you";
        String[] words = input.split(" ");
        String result = "";

        for (String word : words) {
            if (word.length() > 0) {
                result += word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
            }
        }

        System.out.println("Output: " + result.trim());
    }

}
