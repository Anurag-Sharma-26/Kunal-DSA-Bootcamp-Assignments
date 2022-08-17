import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the numbers a and b: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("Enter the operation (+, -, *, /): ");
        String c = scan.next();

        if(c.equals("*")){
            System.out.println("Answer: " + a * b);
        }
        else if(c.equals("/")){
            System.out.println("Answer: " + a / b);
        }
        else if(c.equals("+")){
            System.out.println("Answer: " + (a + b));
        }
        else if(c.equals("-")){
            System.out.println("Answer: " + (a - b));
        }
    }
}
