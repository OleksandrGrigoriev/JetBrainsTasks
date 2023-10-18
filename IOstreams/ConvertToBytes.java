package IOstreams;

import java.io.InputStream;
import java.util.Arrays;

/** Read an input text from the console and print it as a sequence of bytes.
 *  Use System.in as input stream directly. Avoid using Scanner.
 */
class ConvertToBytes {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        byte[] string = inputStream.readAllBytes();
        System.out.println(Arrays.toString(string));
        for (int i = 0; i < string.length - 1; i++) {
            System.out.print(string[i]);
        }
        inputStream.close();
    }

//     do {
//        System.out.print(inputStream.read());
//    } while (inputStream.available() != 0);
}
