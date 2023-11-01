package Interfaces;

import java.util.Arrays;

/**
 * Strings in Java implement the java.lang.CharSequence interface. Since Java internally uses UTF-16,
 * 2 bytes are required to store each char. At the same time, ASCII encoding allows storing character
 * codes in one byte and includes all Latin letters, digits, and standard special characters.
 * Compared to the standard String class, ASCII-character sequences require half the memory.
 * Write a class named AsciiCharSequence for storing ASCII-character sequences, that should:
 * implement the interface java.lang.CharSequence;
 * have a constructor that takes a byte array;
 * have methods int length(), char charAt(int idx), CharSequence subSequence(int from, int to), and String toString().
 * You can find the declaration of methods and their behavior in the description of java.lang.CharSequence (JavaDoc or sources).
 * Carefully check the signatures of the abstract methods of the java.lang.CharSequence interface,
 * especially of the subSequence method. It accepts 2 integers: start index (inclusive) and end index (exclusive).
 * The method returns an object of a class that implements the java.lang.CharSequence interface.
 * In this example it will be an instance of the AsciiCharSequence class.
 * Note: the testing system will always pass correct input parameters to overridden methods.
 * P.S. This feature is supported since Java 9 in standard strings. For details, see this article on compact strings in Java 9.
 */

public class CompactStringsWithAsciiCharSequence {
    public static void main(String[] args) {

    }
}
class AsciiCharSequence implements CharSequence {

    private byte[] charSequence;
    public AsciiCharSequence(byte[] charSequence) {
        this.charSequence = charSequence;
    }

    @Override
    public int length() {
        return charSequence.length;
    }

    @Override
    public char charAt(int index) {
        return (char)charSequence[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] resultArray = new byte[end - start];
        int index = 0;
        for (int position = start; position < end; position++, index++) {
            resultArray[index] = charSequence[position];
        }

        return new AsciiCharSequence(resultArray);
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();

        for (int index = 0; index < charSequence.length; index++) {
            result.append((char)charSequence[index]);
        }

        return result.toString();
    }
}
