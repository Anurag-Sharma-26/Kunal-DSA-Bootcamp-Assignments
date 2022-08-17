import java.util.Scanner;

public class CurvedSurfaceAreaCylinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Radius and Height of the Cylinder: ");
        double r = scan.nextDouble();
        double h = scan.nextDouble();

        double csa = 2 * Math.PI * r * h;

        System.out.println("Curved Surface Area of the Cylinder is: " + csa);
    }
}
