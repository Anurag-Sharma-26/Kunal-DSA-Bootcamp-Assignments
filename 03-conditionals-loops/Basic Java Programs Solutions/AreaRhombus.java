import java.util.Scanner;

public class AreaRhombus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of Diagonal 1 and Diagonal 2 of the Rhombus: ");
        double d1 = scan.nextDouble();
        double d2 = scan.nextDouble();
        double area = 0.5 * (d1 * d2);

        System.out.println("Area of the Rhombus is: " + area);
    }
}
