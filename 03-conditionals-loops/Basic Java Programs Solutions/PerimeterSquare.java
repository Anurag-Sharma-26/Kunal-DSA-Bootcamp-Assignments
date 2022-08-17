import java.util.Scanner;

public class PerimeterSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of Side of the Square: ");
        double a = scan.nextDouble();
        double p = 4 * a;

        System.out.println("Perimeter of the Square is: " + p);
    }
}
