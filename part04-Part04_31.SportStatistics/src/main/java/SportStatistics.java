
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");

        String fileName = scan.nextLine();

        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {

            System.out.println("Team:");
            String name = scan.nextLine();

            int count = 0;
            int wins = 0;
            int looses = 0;

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(",");

                String team1 = parts[0];
                String team2 = parts[1];
                int points1 = Integer.valueOf(parts[2]);
                int points2 = Integer.valueOf(parts[3]);

                if (team1.equals(name) || team2.equals(name)) {
                    count = count + 1;
                }

                if (team1.equals(name)) {
                    if (points1 > points2) {
                        wins = wins + 1;
                    } else {
                        looses = looses + 1;
                    }
                }
                if (team2.equals(name)) {
                    if (points1 < points2) {
                        wins = wins + 1;
                    } else {
                        looses = looses + 1;
                    }
                }

            }
            System.out.println("Games: " + count);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + looses);
        } catch (Exception e) {
            System.out.println("Error;");
        }
    }
}
