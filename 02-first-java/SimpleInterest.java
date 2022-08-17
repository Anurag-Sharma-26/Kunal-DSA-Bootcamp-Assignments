import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the Principal, Time (in years) and Rate: ");
        double p = scan.nextDouble();
        double t = scan.nextDouble();
        double r = scan.nextDouble();

        double total = (p * r * t) / 100;

        System.out.print(total);

    }
}
