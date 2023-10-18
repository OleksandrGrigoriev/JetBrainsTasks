package LocalDate;

import java.time.LocalDate;
import java.util.Scanner;

public class ConvertNumbersToDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();
        int firstDate = scanner.nextInt();
        int secondDate = scanner.nextInt();
        int thirdDate = scanner.nextInt();

        System.out.println(LocalDate.ofYearDay(year, firstDate));
        System.out.println(LocalDate.ofYearDay(year, secondDate));
        System.out.println(LocalDate.ofYearDay(year, thirdDate));


        scanner.close();
    }
}
