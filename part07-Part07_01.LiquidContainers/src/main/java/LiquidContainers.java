
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstContainer = 0;
        int secondContainer = 0;
        int maxLiquid = 100;

        while (true) {
            System.out.println("First: " + firstContainer + "/" + maxLiquid);
            System.out.println("Second: " + secondContainer + "/" + maxLiquid);

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                int sum = firstContainer + amount;

                if (sum < maxLiquid && amount >= 0) {
                    firstContainer = firstContainer + amount;
                } else {
                    firstContainer = maxLiquid;
                }
            }

            if (command.equals("move")) {
                int sum = firstContainer - amount;

                if (sum < 0) {
                    secondContainer = secondContainer + firstContainer;
                    firstContainer = 0;
                } else {
                    firstContainer = sum;
                    secondContainer = secondContainer + amount;
                    if (secondContainer > maxLiquid) {
                        secondContainer = maxLiquid;
                    }

                }
            }

            if (command.equals("remove") && amount >= 0) {
                int sum = secondContainer - amount;

                if (sum < 0) {
                    secondContainer = 0;
                } else if (sum >= 0) {
                    secondContainer = secondContainer - amount;
                }
                {

                }

            }

        }

    }
}
