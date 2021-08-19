
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        //System.out.println("The numbers in the range [" + lowerLimit + "," + upperLimit + "]");
        for (int i = 0; i < numbers.size(); i++) {
            if (lowerLimit <= numbers.get(i) && upperLimit >= numbers.get(i)) {
                System.out.println(numbers.get(i));
            }
        }
    }
}
