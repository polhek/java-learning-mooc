
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while (true) {

            int num = scanner.nextInt();

            if (num == 0) {
                if (count == 0) {
                    System.out.println("Cannot calculate the average");
                    break;
                }
                double avg = (double) sum / count;
                System.out.println(avg);
                break;
            }

            if (num > 0) {
                sum = sum + num;
                count++;
                continue;
            }
        }
    }
}
