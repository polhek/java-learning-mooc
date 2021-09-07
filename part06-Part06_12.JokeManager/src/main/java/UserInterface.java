
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author zigagroselj
 */
public class UserInterface {

    private JokeManager joke;
    private Scanner scanner;

    public UserInterface(JokeManager joke, Scanner scanner) {
        this.joke = joke;
        this.scanner = scanner;
    }

    public void start() {
        readInput();
    }

    private void printCommands() {
        System.out.println("Commands:");
        System.out.println("1 - add a joke");
        System.out.println("2 - draw a joke");
        System.out.println("3 - list a joke");
        System.out.println("X - stop");
    }

    private void readInput() {
        while (true) {
            printCommands();

            String task = scanner.nextLine();

            if (task.equals("X")) {
                break;
            }
            if (task.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                this.joke.addJoke(joke);
                continue;
            }

            if (task.equals("2")) {

                System.out.println(this.joke.drawJoke());
                continue;
            }

            if (task.equals("3")) {
                this.joke.printJokes();
                continue;

            }
        }
    }

}
