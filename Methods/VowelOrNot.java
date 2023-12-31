package Methods;

import java.util.Scanner;

public class VowelOrNot {
    public static boolean isVowel(char ch) {
        // write your code here
        return switch (ch) {
            case 'a', 'o', 'e', 'u', 'y', 'i', 'A', 'O', 'E', 'U', 'Y', 'I' -> true;
            default -> false;
        };
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}
