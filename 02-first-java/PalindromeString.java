import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word to check: ");
        String str = scan.next();
        String reverseStr = "";

        int strLength = str.length();

        for(int i = (strLength - 1); i >= 0; --i){
            reverseStr += str.charAt(i);
        }
        if(str.toLowerCase().equals(reverseStr.toLowerCase())) System.out.println("It is Palindrome");
        else System.out.println("It is not Palindrome");
    }
}
