package runner;

public class FindTarget {
    public static void main(String[] args) {
        String sentence = "Hello World this is a test";
        String target = "World";
        if (sentence.contains(target)) {
            System.out.println(target + " is present in the sentence");
        } else {
            System.out.println(target + " is not present in the sentence");
        }
    }
}
