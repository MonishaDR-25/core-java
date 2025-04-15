package runner;

public class CharacterCount {
    public static void main(String[] args) {
        String sentence = "Hello World";
        int count = 0;
        char target = 'l';
        for (char c : sentence.toCharArray()) {
            if (c == target) {
                count++;
            }
        }
        System.out.println("The character '" + target + "' appears " + count + " times");
    }
}
