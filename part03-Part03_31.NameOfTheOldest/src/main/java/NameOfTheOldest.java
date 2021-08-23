
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String oldestName = "";
        int oldest = 0;
        while (true) {
            String text = scanner.nextLine();

            if (text.equals("")) {
                break;
            }

            String[] pieces = text.split(",");
            String name = pieces[0];
            int old = Integer.valueOf(pieces[1]);
            if (oldest < old) {
                oldest = old;
                oldestName = name;
            }
        }

        System.out.println("Name of the oldest: " + oldestName);
    }
}
