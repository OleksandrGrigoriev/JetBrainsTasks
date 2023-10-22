package LocalDate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class FindAllMondays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();
        int month = scanner.nextInt();

        LocalDate beginningOfMonth = LocalDate.of(year, month, 1);
        LocalDate endOfMonth = LocalDate.of(year, month, beginningOfMonth.lengthOfMonth());

        for (int i = beginningOfMonth.getDayOfMonth(); i <= endOfMonth.getDayOfMonth(); i++) {
            if (LocalDate.of(year, month, i).getDayOfWeek() == DayOfWeek.MONDAY) {
                System.out.println(LocalDate.of(year, month, i).toString());
            }
        }
        scanner.close();
    }
}
