package InnerClases;

/**
 * Add the field int horsePower to the class Engine.
 * Then create a method void printHorsePower inside the inner class that prints the name of your Vehicle
 * and the horsePower of its Engine.
 * For a vehicle called Dixi with 20 horsepower the output of printHorsePower should be:
 * Vehicle Dixi has 20 horsepower.
 * And don't forget to add constructors in both classes!
 * Please, don't use access modifier private for methods.
 */

public class ImproveYourCar {
}

class Vehicle1 {

    private String name;

    // create constructor


    public Vehicle1(String name) {
        this.name = name;
    }

    class Engine {

        // add field horsePower\
        private int horsePower;
        // create constructor

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        void start() {
            System.out.println("RRRrrrrrrr....");
        }

        // create method printHorsePower()
        public void printHorsePower() {
            System.out.println("Vehicle " + name + " has " + horsePower + " power.");
        }
    }
}

// this code should work
class EnjoyVehicle1 {

    public static void main(String[] args) {

        Vehicle1 vehicle = new Vehicle1("Dixi");
        Vehicle1.Engine engine = vehicle.new Engine(20);
        engine.printHorsePower();
    }
}