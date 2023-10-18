package RandomGenerator;

import java.util.Random;
import java.util.Scanner;

public class GenerateRandomNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;

        Random random = new Random(a + b);


        for (int i = 0; i < n; i++) {
            sum += (random.nextInt(b - a + 1) + a);
        }

        System.out.println(sum);
    }
}
