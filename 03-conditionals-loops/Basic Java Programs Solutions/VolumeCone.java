import java.util.Scanner;

public class VolumeCone {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Radius and Height of the Cone: ");
        double r = scan.nextDouble();
        double h = scan.nextDouble();

        double v = Math.PI * (r * r) * (h / 3);

        System.out.println("Volume of the Cone is: " + v);
    }
}
