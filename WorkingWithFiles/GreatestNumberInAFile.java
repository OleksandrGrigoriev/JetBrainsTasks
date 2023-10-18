package WorkingWithFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Here is a file containing a sequence of integers separated by spaces.
 * Download it and write a Java program that finds the greatest number in this file.
 * Enter the result.
 **/

public class GreatestNumberInAFile {
    public static void main(String[] args) {

        int max = Integer.MIN_VALUE;
        String pathToFile = "E:\\dataset_91007.txt";
        File file = new File(pathToFile);

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextInt()) {
                int nextNum = scanner.nextInt();
                if(nextNum > max) {
                    max = nextNum;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + pathToFile);
        }
        System.out.println(max);
    }
}
