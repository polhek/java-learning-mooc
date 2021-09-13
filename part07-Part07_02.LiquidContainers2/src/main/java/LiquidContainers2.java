
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer.toString());
            System.out.println("Second: " + secondContainer.toString());

            String input = scanner.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                firstContainer.add(amount);
            }

            if (command.equals("remove")) {
                secondContainer.remove(amount);
            }

            if (command.equals("move")) {
                if (firstContainer.contains() - amount < 0) {
                    secondContainer.add(firstContainer.contains());
                    firstContainer.remove(amount);
                } else {
                    firstContainer.remove(amount);
                    secondContainer.add(amount);
                }
            }

        }
    }
}
