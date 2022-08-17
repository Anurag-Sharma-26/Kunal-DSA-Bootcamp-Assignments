import java.util.Scanner;



public class AreaTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Height and the Base of the Triangle: ");
        double h = scan.nextDouble();
        double b = scan.nextDouble();

        // Formula to calculate Area of Triangle or Isosceles Triangle

        double area = 0.5 * (b * h);

        System.out.println("Area of the Triangle is: " + area);
    }
}
