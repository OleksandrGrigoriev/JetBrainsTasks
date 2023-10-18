package CheckedExceptions;
import java.util.Scanner;

/**
 * Write a program that creates a checked exception named CustomException
 * and has a constructor with an Exception argument.
 */

// Do not change the class
class CheckedExcWithConstructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exception e = new Exception(sc.nextLine());
        Exception customException = new CustomException(e);

        System.out.println(customException.getMessage());
    }
}

// Write a CustomException class that extends Exception
// and has a constructor with an Exception argument
class CustomException extends Exception {

    private Exception e;

    public CustomException(Exception e) {
        super(e);
    }
}

