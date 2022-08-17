import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Radius of the Circle: ");
        double r = scan.nextDouble();
        double area = Math.PI * (r * r);

        System.out.println("Area of the Circle is: " + area);

    }
}
