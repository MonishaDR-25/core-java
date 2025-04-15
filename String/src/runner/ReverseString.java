package runner;

public class ReverseString {
    public static void main(String[] args){
        String name="Monisha";
        char[] NewName=name.toCharArray();
        int count=0;
        for(char c: NewName) {
            count++;
        }
        System.out.println("Reversed string is: ");
        for(int i=count-1;i>=0;i--)
        {
            System.out.println(NewName[i]);
        }

    }
}
