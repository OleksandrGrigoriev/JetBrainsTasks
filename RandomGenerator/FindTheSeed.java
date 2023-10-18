package RandomGenerator;

import java.util.*;

public class FindTheSeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int minimumOfMaximums = Integer.MAX_VALUE;
        int numberOfSeed = -1;

        for (int i = a; i <= b; i++) {

            Random random = new Random(i);
            int localMaximum = Integer.MIN_VALUE;

            for (int j = 0; j < n; j++) {
                int randomNumber = random.nextInt(k);
                if(randomNumber > localMaximum)
                    localMaximum = randomNumber;
            }
            if (minimumOfMaximums > localMaximum) {
                minimumOfMaximums = localMaximum;
                numberOfSeed = i;
            }
        }
        System.out.println(numberOfSeed);
        System.out.println(minimumOfMaximums);

    }
}
