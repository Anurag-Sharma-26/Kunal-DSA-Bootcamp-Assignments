import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String s = scan.next();

        System.out.println("Hello " + s + " have a good day.");
    }
}
