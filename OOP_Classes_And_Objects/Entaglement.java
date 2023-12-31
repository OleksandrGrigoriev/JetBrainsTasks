package OOP_Classes_And_Objects;

public class Entaglement {
    public static void main(String[] args) {
        SomeClass instance = new SomeClass(300, "another-value");

        System.out.println(instance.val + " " + instance.str);
    }
}

class SomeClass {

    int val = 50;
    String str = "default";

    public SomeClass() {
        this(100);
    }

    public SomeClass(int val) {
        val = val;
    }

    public SomeClass(String str) {
        this();
        this.str = "some-value";
    }

    public SomeClass(int val, String str) {
        this(str);
    }
}