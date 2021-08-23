
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username:");
        String username = scanner.nextLine();

        System.out.println("Enter password:");
        String password = scanner.nextLine();

        String[] user = {"alex", "emma"};
        String[] passwords = {"sunshine", "haskell"};

        if ((user[0].equals(username) && passwords[0].equals(password)) || (user[1].equals(username) && passwords[1].equals(password))) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}