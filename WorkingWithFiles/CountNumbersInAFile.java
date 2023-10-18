package WorkingWithFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *  write a Java program that counts numbers that are greater than or equal to 9999.
 */
public class CountNumbersInAFile {
    public static void main(String[] args) throws FileNotFoundException {
        String pathToAFile = "E:\\dataset_91022.txt";
        File file = new File(pathToAFile);
        int counter = 0;

        try (Scanner input = new Scanner(file)) {
            while (input.hasNextInt()) {
                int number = input.nextInt();

                if (number >= 9999)
                    counter++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + pathToAFile);
        }

        System.out.println(counter);
    }
}
