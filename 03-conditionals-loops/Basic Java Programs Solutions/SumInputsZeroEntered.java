import java.util.Scanner;

public class SumInputsZeroEntered {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int input;

        while ((input = scan.nextInt()) != 0){
            sum += input;
        }

        System.out.println(sum);
    }
}
