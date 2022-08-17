import java.util.Scanner;

public class AreaParallelogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Height and the Base of the Parallelogram: ");
        double h = scan.nextDouble();
        double b = scan.nextDouble();

        double area = b * h;

        System.out.println("Area of the Parallelogram is: " + area);
    }
}
