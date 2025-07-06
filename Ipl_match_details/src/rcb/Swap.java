package rcb;

public class Swap {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // Swap using concatenation
        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        // Output the swapped values
        System.out.println("After Swap:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
    }
}
