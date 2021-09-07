
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

    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("add")) {
                System.out.println("To add:");
                String task = scanner.nextLine();
                if (task.isEmpty()) {
                    return;
                }
                this.todoList.add(task);
            }

            if (command.equals("list")) {
                this.todoList.print();
            }

            if (command.equals("remove")) {
                System.out.println("Which one is removed?");
                int removedIndex = Integer.valueOf(scanner.nextLine());

                this.todoList.remove(removedIndex);
            }

        }

    }
}
