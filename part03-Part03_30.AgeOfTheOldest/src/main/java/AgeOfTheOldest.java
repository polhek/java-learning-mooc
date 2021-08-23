
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;

        while (true) {
            String text = scanner.nextLine();

            if (text.equals("")) {
                break;
            }

            String[] parts = text.split(",");
            int old = Integer.valueOf(parts[1]);
            if (old > oldest) {
                oldest = old;
            }
        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
