package WorkingWithFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountEvenNumbers {
    public static void main(String[] args) {

        String pathToFile = "E:\\dataset_91065.txt";
        File file = new File(pathToFile);
        int counter = 0;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                int nextNum = Integer.parseInt(scanner.nextLine());
                if (nextNum == 0)
                    break;
                if (nextNum % 2 == 0)
                    counter++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + pathToFile);
        }
        System.out.println(counter);
    }
}
