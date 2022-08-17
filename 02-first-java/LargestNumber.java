import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the numbers a and b: ");
        int a = scan.nextInt();
        int b = scan.nextInt();

        if(a < b){
            System.out.println("b is larger");
        }
        else {
            System.out.println("a is larger");
        }
    }
}
