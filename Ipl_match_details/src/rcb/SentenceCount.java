package rcb;

public class SentenceCount {
    public static void main(String[] args) {
        String sentence = "Today is my day, I will do best";
        int vowelCount = 0;
        int consonantCount = 0;
        sentence = sentence.toLowerCase();

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);


            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }

            else if (ch >= 'a' && ch <= 'z') {
                consonantCount++;
            }
        }

        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
    }

}
