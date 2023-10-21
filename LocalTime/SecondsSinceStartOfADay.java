package LocalTime;

import java.time.LocalTime;
import java.util.Scanner;

public class SecondsSinceStartOfADay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println( LocalTime.ofSecondOfDay(scanner.nextInt()) );

        scanner.close();
    }
}
