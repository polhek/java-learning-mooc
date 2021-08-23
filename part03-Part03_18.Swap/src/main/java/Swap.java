
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("");

        // Implement here
        // asking for the two indices
        // and then swapping them
        System.out.println("Give two indices to swap:");
        int ind1 = scanner.nextInt();
        int ind2 = scanner.nextInt();

        array = swap(ind1, ind2, array);

        System.out.println("");
        index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }

    public static int[] swap(int index1, int index2, int[] array) {
        int[] newArr = array;
        int helper = newArr[index1];
        newArr[index1] = newArr[index2];
        newArr[index2] = helper;

        return newArr;
    }

}
