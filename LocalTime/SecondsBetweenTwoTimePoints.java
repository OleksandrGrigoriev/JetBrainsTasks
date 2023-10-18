package LocalTime;

import java.time.Duration;
import java.util.Scanner;
import java.time.LocalTime;

public class SecondsBetweenTwoTimePoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        LocalTime time1 = LocalTime.parse(scanner.nextLine());
        LocalTime time2 = LocalTime.parse(scanner.nextLine());

        int seconds = Math.abs((time2.getHour() - time1.getHour()) * 3600 + (time2.getMinute() - time1.getMinute()) * 60 +
                (time2.getSecond() - time1.getSecond()));

        System.out.println(seconds);

//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//            LocalTime l1 = LocalTime.parse(scanner.nextLine());
//            LocalTime l2 = LocalTime.parse(scanner.nextLine());
//            System.out.println(Math.abs(Duration.between(l1, l2).toSeconds()));
//        }
    }
}
