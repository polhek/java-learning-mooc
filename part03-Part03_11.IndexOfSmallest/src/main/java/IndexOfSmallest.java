
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int num = scanner.nextInt();

            if (num == 9999) {
                break;
            }

            numbers.add(num);

        }
        System.out.println("Smallest number: " + smallestNumber(numbers));

        indexOf(smallestNumber(numbers), numbers);
    }

    public static int smallestNumber(ArrayList<Integer> array) {
        int smallest = array.get(0);

        for (int i = 0; i < array.size(); i++) {
            if (smallest > array.get(i)) {
                smallest = array.get(i);
            }
        }

        return smallest;
    }

    public static void indexOf(int smallest, ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            if (smallest == array.get(i)) {
                System.out.println("Found at index: " + i);
            }
        }

    }

}
