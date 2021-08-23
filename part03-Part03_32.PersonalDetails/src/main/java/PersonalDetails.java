
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        int sum = 0;
        int count = 0;
        double avg = 0;
        while (true) {
            String text = scanner.nextLine();

            if (text.equals("")) {
                break;
            }

            String[] pieces = text.split(",");
            String name = pieces[0];
            int year = Integer.valueOf(pieces[1]);

            sum = sum + year;
            count++;

            if (longestName.length() < name.length()) {
                longestName = name;
            }

        }
        avg = (double) sum / count;

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + avg);
    }
}
