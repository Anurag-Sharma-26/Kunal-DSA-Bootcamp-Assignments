import java.util.Scanner;

public class InrUsd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount in INR: ");
        int a = scan.nextInt();

        double b = a / 79.42;
        System.out.println("Amount in USD: " + b);
    }
}
