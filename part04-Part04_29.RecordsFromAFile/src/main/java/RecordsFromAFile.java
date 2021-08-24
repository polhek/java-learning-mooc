
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try (Scanner fileExplorer = new Scanner(Paths.get(file))) {
            while (fileExplorer.hasNextLine()) {

                String line = fileExplorer.nextLine();

                String[] parts = line.split(",");
                
                String name = parts[0];
                String year = parts[1];
                
                System.out.println(name +", age: " + year + " years");
                
            }
        } catch (Exception e) {
        }

    }
}
