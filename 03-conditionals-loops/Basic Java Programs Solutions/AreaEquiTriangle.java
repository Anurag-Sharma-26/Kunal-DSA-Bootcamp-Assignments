import java.util.Scanner;

public class AreaEquiTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of the Side of the Triangle: ");
        double a = scan.nextDouble();

        double area = Math.sqrt(3) / 4 * (a * a);

        System.out.println("Area of the Triangle is: " + area);
    }
}
