package SwitchExpression;

import java.util.Scanner;

public class MonthOfTheYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfTheMonth = scanner.nextInt();

        String output = switch(numberOfTheMonth) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            default -> "Error!";
        };

        System.out.println(output);

        scanner.close();
    }
}
