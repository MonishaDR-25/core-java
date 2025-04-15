package runner;

public class CountSpaces {
    public static void main(String[] args) {
        String sentence = "Welcome to Hello World ";
        int count = 0;
        for (char c : sentence.toCharArray()) {
            if (c == ' ') {
                count++;
            }
        }
        System.out.println("There are " + count + " spaces");
    }
}
