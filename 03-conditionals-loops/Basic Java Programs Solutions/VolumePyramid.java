import java.util.Scanner;

public class VolumePyramid {public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the Base Length, Base Width and Height of the Pyramid: ");
    double l = scan.nextDouble();
    double w = scan.nextDouble();
    double h = scan.nextDouble();

    double v = (l * w * h) / 3;

    System.out.println("Volume of the Pyramid is: " + v);
}
}
