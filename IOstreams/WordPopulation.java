package IOstreams;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
        List<Long> list = new ArrayList<>();
        List<Integer> years = new ArrayList<>();
        int i = 0;
        try (Scanner scanner = new Scanner(file)) {
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (i > 0) {
                    String[] tempArr = line.split("\t");
                    tempArr[1] = tempArr[1].replaceAll(",", "");
                    years.add(Integer.parseInt(tempArr[0]));
                    list.add(Long.parseLong(tempArr[1]));
                }
                i++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + pathToFile);
        }
        System.out.println(years);
        long maxDifference = list.get(1) - list.get(0);
        int currentYear = 0;

        for (int j = 2; j < list.size(); j++) {
            long currentDifference = list.get(j) - list.get(j - 1);
            if (currentDifference > maxDifference) {
                maxDifference = currentDifference;
                currentYear = years.get(j);
            }
        }

        System.out.println(currentYear);
    }
}
