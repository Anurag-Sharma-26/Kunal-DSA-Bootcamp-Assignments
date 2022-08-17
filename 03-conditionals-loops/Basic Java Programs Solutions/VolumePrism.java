import java.util.Scanner;

public class VolumePrism {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Base and Height of the Prism: ");
        double b = scan.nextDouble();
        double h = scan.nextDouble();

        double v = b * h;

        System.out.println("Volume of the Prism is: " + v);
    }
}
