
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        

        System.out.println("Last number?");
        int last = scanner.nextInt();

        for (int i = 0; i <= last; i++) {
            sum = sum + i;

        }
        System.out.println("The sum is " + sum);
    }
}
