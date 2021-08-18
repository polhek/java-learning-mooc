
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int where = scanner.nextInt();
        System.out.println("Where from?");
        int from = scanner.nextInt();

        if (from <= where) {
            for (int i = from; i <= where; i++) {
                System.out.println(i);
            }
        }
    }
}
