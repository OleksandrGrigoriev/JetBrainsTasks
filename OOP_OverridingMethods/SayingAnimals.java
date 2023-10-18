package OOP_OverridingMethods;

/**
 * You have four classes: Animal, Cat, Dog, and Duck.
 * The class animal has a method say().
 * Override the method in all subclasses.
 * Overridden methods should output what these animals say (using System.out.println).
 * Cat: meow-meow
 * Dog: arf-arf
 * Duck: quack-quack
 */
public class SayingAnimals {
    public static void main(String[] args) {

    }
}

class Animal {
    public void say() {
        System.out.println("...An incomprehensible sound...");
    }
}

class Cat extends Animal {
    @Override
    public void say() {
        System.out.println("meow-meow");
    }
}

class Dog extends Animal {
    @Override
    public void say() {
        System.out.println("arf-arf");
    }
}

class Duck extends Animal {
    @Override
    public void say() {
        System.out.println("quack-quack");
    }
}
