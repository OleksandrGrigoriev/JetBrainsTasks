package ThrowingExceptions;

/**
 * Your task is to write a drive() method which prints to the console the string "Here we go"
 * if both arguments are true, or otherwise throws the DriverNotReady exception with the message
 * "Close the door or fasten your seatbelt"
 */

import java.util.Scanner;

class Driver {
    String name;
    Boolean isDoorLocked;
    Boolean isBeltFastened;

    public Driver(String name, Boolean isDoorLocked, Boolean isBeltFastened) {
        this.name = name;
        this.isDoorLocked = isDoorLocked;
        this.isBeltFastened = isBeltFastened;

    }

    public void closeDoor() {
        this.isDoorLocked = true;
    }

    public void fastenBelt() {
        this.isBeltFastened = true;
    }

    public void drive(boolean isBeltFastened, boolean isDoorLocked) throws DriverNotReadyException {
        //put your code here
        if (isDoorLocked && isBeltFastened) { System.out.println("Here we go"); }
        else { throw new DriverNotReadyException("Close the door or fasten your seatbelt"); }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        Boolean isDoorLocked = scanner.nextBoolean();
        Boolean isBeltFastened = scanner.nextBoolean();
        Driver driver = new Driver(name, isDoorLocked, isBeltFastened);
        try {
            driver.drive(isBeltFastened, isDoorLocked);
        } catch (DriverNotReadyException e) {
            System.out.println(e.getMessage());
        }

    }
}

class DriverNotReadyException extends Exception {
    public DriverNotReadyException(String message) {
        super(message);
    }
}

