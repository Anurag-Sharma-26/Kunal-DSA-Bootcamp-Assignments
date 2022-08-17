import java.util.Scanner;

public class TotalSurfaceAreaCube {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Side of Cube: ");
        double a = scan.nextDouble();
        double tsa = 6 * a * a;

        System.out.println("Total Surface Area of the Cube is: " + tsa);
    }
}
