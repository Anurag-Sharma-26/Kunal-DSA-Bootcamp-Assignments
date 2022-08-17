import java.util.Scanner;

public class VolumeSphere {public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the Radius of Sphere: ");
    double r = scan.nextDouble();
    double v = 1.33 * Math.PI * (r * r * r);

    System.out.println("Volume of the Sphere is: " + v);
}
}
