package rcb;

public class Replace {
    public static void main(String[] args) {


    String input = "you are welcome";
    String output = "";


        for (int i = 0; i < input.length(); i++) {
        char ch = input.charAt(i);

        if (ch == 'a') {
            output += 'b';
        } else if (ch == 'e') {
            output += 'f';
        } else if (ch == 'i') {
            output += 'j';
        } else if (ch == 'o') {
            output += 'p';
        } else if (ch == 'u') {
            output += 'v';
        } else if (ch == 'A') {
            output += 'B';
        } else if (ch == 'E') {
            output += 'F';
        } else if (ch == 'I') {
            output += 'J';
        } else if (ch == 'O') {
            output += 'P';
        } else if (ch == 'U') {
            output += 'V';
        } else {

            output += ch;
        }
    }


        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
}
}

