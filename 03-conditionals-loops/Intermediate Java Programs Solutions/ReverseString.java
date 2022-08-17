import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word to check: ");
        String str = scan.nextLine();
        String reverseStr = "";

        int strLength = str.length();

        for(int i = (strLength - 1); i >= 0; --i){
            reverseStr += str.charAt(i);
        }
        System.out.println(reverseStr);
    }
}
