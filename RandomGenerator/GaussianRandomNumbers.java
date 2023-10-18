package RandomGenerator;

/**
 * For the given numbers K, N, and M find the first seed that is greater than or equal to K
 * where each of N Gaussian numbers is less than or equal to M.
 * The input contains numbers K, N, M in a single line.
 * You should output the seed.
 */

import java.util.Random;
import java.util.Scanner;

public class GaussianRandomNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        int n = scanner.nextInt();
        double m = scanner.nextDouble();
        int res = 0;

        while(true) {
            Random random = new Random(k);
            boolean condition = true;

            for (int i = 0; i < n; i++) {
                if (random.nextGaussian() > m) {
                    condition = false;
                    break;
                }
            }

            if (condition) {
                res = k;
                break;
            }
            k++;
        }
        System.out.println(res);
    }
}
