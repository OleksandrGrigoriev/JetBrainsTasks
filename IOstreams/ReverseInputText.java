package IOstreams;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Read an input text from the console and print its characters in reversed order.
 * Use Reader for collecting characters.
 * In this task, the input is limited by 50 characters. However, you are welcome to find a solution that
 * does not depend on the input size, which may require some extra knowledge.
 * It is important to understand the difference between the input stream closing and pressing Enter in
 * case of testing in IDEA. Hyperskill platform produces test input and sends end-of-file event right away.
 * It does not append additional end-of-line symbols.
 * Tip: If you're reading an input in an array, remember not to output extra characters.
 * Consider the number of read characters.
 */

public class ReverseInputText {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // start coding here
        String line = reader.readLine();
        StringBuilder result = new StringBuilder();
        for (int i = line.length() - 1; i >= 0 ; i--) {
            result.append(line.charAt(i) != ' ' ? line.charAt(i) : "");
        }
        System.out.println(result);
        reader.close();

//        StringBuilder sb = new StringBuilder();
//        reader.lines().forEachOrdered(sb::append);
//        System.out.println(sb.reverse());
//        reader.close();
    }
}
