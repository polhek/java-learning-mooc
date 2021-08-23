
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Statistics sumOfAll = new Statistics();
        Statistics sumOfEven = new Statistics();
        Statistics sumOfOdd = new Statistics();
        System.out.println("Enter numbers:");
        while (true) {
            int number = scanner.nextInt();

            if (number == -1) {
                break;
            }
            sumOfAll.addNumber(number);

            if (number % 2 == 0) {
                sumOfEven.addNumber(number);
            } else {
                sumOfOdd.addNumber(number);
            }
        }
        System.out.println("Sum: " + sumOfAll.sum());
        System.out.println("Sum of even numbers: " + sumOfEven.sum());
        System.out.println("Sum of odd numbers: " + sumOfOdd.sum());
    }
}
