//  LeetCode problem 1281. Subtract the Product and Sum of Digits of an Integer

import java.util.Scanner;

public class SubtractProductAndSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scan.nextInt();
        int sum = 0;
        int prod = 1;

        while(n>0){
            int temp = n % 10;
            sum += temp;
            prod *= temp;

            n = n/10;
        }
        System.out.println("The Final Answer is: " + (prod - sum));
    }
}
