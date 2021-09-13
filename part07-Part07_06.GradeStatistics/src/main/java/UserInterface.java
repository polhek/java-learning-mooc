
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

    private Scanner scanner;
    private Statistics statistics;

    public UserInterface(Scanner scanner, Statistics statistics) {
        this.scanner = scanner;
        this.statistics = statistics;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");

        while (true) {
            String input = scanner.nextLine();

            int number = Integer.valueOf(input);

            if (number == -1) {
                break;
            }

            statistics.add(number);
        }

        System.out.println("Point average (all): " + statistics.calculateAvg());

        if (this.statistics.passingAvg() != 0.0) {
            System.out.println("Point average (passing): " + this.statistics.passingAvg());
        } else {
            System.out.println("Point average (passing): -");
        }

        System.out.println("Pass percentage: " + this.statistics.passPercantage());
        
        System.out.println("Grade distribution:");
        this.statistics.gradeDistribution();
    }

}
