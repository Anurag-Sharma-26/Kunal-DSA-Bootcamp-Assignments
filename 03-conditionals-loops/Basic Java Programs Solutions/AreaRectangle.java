import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Length and the Width of the Rectangle: ");
        double l = scan.nextDouble();
        double w = scan.nextDouble();
        double area = w * l;

        System.out.println("Area of the Rectangle is: " + area);
    }
}
