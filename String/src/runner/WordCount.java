package runner;

public class WordCount {
    public static void main(String[] args) {
        String sentence = "Hello World";
        String[] words = sentence.split("\\s+");
        System.out.println(words.length);
    }
}
