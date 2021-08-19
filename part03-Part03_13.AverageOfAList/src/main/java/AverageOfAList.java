
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int input = scanner.nextInt();

            if (input == -1) {
                break;
            }

            numbers.add(input);

        }
        
         System.out.println("Average: " + average(numbers));

    }

    public static double average(ArrayList<Integer> array) {
        int sum = 0;
        int count = array.size();

        for (int i = 0; i < array.size(); i++) {
            sum = sum + array.get(i);
        }

        double avg = (double) sum / count;

        return avg;
    }
}
