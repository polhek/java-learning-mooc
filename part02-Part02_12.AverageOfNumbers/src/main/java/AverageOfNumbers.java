
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            System.out.println("Give a number:");
            int num = scanner.nextInt();

            if (num == 0) {
                double avg = (double) sum / count;
                System.out.println("Average of the numbers: " + avg);
                break;
            }

            sum = sum + num;
            count++;

        }

    }
}
