package TypesOfReferences;

import java.lang.ref.SoftReference;
import java.util.Scanner;

/**
 * Initialize the SoftReference and print the value returned by the get() method.
 */

public class GetTheVariableValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer num = scanner.nextInt();
        // inititalize an instance of SoftReference by passing num to the constructor
        SoftReference<Integer> softReference = new SoftReference<>(num);

        num = null;

        System.out.println(softReference.get());
    }
}
