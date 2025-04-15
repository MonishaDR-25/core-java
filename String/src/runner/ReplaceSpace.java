package runner;

public class ReplaceSpace {
    public static void main(String[] args) {
        String sentence = " Welcome to Hello World ";
        String replaced = sentence.replace(' ', '%');
        System.out.println(replaced);
    }
}
