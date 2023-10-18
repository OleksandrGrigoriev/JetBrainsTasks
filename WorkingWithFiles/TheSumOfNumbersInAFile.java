package WorkingWithFiles;

/**
 * Here's a file containing a sequence of integers. Each number starts with a new line.
 * Download it and write a Java program that calculates the sum of these numbers.
 * Enter the result.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TheSumOfNumbersInAFile {
    public static void main(String[] args) {

        int sum = 0;
        String pathToFile = "E:\\dataset_91033.txt";
        File file = new File(pathToFile);

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                int nextNum = Integer.parseInt(scanner.nextLine());
                sum += nextNum;
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + pathToFile);
        }
        System.out.println(sum);
    }
}
