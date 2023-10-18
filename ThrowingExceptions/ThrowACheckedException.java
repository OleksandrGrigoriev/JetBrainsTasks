package ThrowingExceptions;

public class ThrowACheckedException {

    public static void method() throws RuntimeException, Exception {
        // write your code here
        throw new Exception(new RuntimeException());
    }

    /* Do not change code below */
    public static void main(String[] args) {
        try {
            method();
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}

