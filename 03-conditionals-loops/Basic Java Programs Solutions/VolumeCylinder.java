import java.util.Scanner;

public class VolumeCylinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Radius and Height of the Cylinder: ");
        double r = scan.nextDouble();
        double h = scan.nextDouble();

        double v = Math.PI * (r * r) * h;

        System.out.println("Volume of the Cylinder is: " + v);
    }
}
