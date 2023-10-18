package IOstreams;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Here's a file that stores data on the world population since 1950, according to the United States
 * Census Bureau (2017). Download the file and write a Java program to find out in what year the largest
 * increase in population occurred as compared to the previous year. The file has two columns: year and population.
 * Take a look at it to understand the format better. Enter the resulting year.
 */

public class WordPopulation {
    public static void main(String[] args) {
        String pathToFile = "E:\\dataset_91069.txt";

        File file = new File(pathToFile);
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        try (Scanner scanner = new Scanner(file)) {
            String line = scanner.nextLine();
            if (i > 0) {
                String[] tempArr = line.split(" ");
                map.put(Integer.parseInt(tempArr[0]), Integer.parseInt(tempArr[1]));
            }
            i++;
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + pathToFile);
        }

    }
}
