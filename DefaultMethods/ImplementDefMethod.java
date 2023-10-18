package DefaultMethods;

/**
 * Define and implement a default method print in the Printer interface to make code in the main method
 * print the text This is a default message. Do not change both Main and ConsolePrinter classes.
 */

public class ImplementDefMethod {
    public static void main(String... args) {
        Printer printer = new ConsolePrinter();
        printer.print(); // prints: This is a default message
    }
}

class ConsolePrinter implements Printer {

}

interface Printer {
    // define and implement default method print to make code above print the message: "This is a default message"
    default void print() {
        System.out.println("This is a default message");
    }
}