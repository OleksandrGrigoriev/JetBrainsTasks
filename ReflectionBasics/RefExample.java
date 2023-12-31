package ReflectionBasics;

import java.lang.reflect.*;

public class RefExample {
    public String firstName;
    public String lastName;
    public int age;
    protected String phoneNumber;
    private String accountNumber;

    RefExample(){
        System.out.println("This is default Constructor");
    }

    public RefExample(String firstName, String lastName){
        this.firstName= firstName;
        this.lastName= lastName;
        System.out.println("This is public Constructor");
    }

    private String sanitizeAccountNumber(String accountNumber){
        System.out.println("This is a private method to sanitize account number");
        //code to sanitize accountNumber goes here.
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber){
        accountNumber = sanitizeAccountNumber(accountNumber);
        this.accountNumber = accountNumber;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Class student = Class.forName("ReflectionBasics.RefExample");
        Constructor[] declaredConstructors = student.getDeclaredConstructors();
        Constructor[] constructors = student.getConstructors();
        Field[] declaredFields = student.getDeclaredFields();
        Field[] fields = student.getFields();
        Method[] declaredMethods = student.getDeclaredMethods();
        Method[] methods = student.getMethods();
        for(Constructor dc : declaredConstructors) {
            System.out.println("Declared Constructor " + dc.getName());
        }
        for (Constructor c : constructors) {
            System.out.println("Constructor " + c.getName());
        }
        for (Field df : declaredFields) {
            System.out.println("Declared Field " + df.getName());
        }
        for (Field f : fields) {
            System.out.println("Field " + f.getName());
        }
        for (Method dm : declaredMethods) {
            System.out.println("Declared Method " + dm.getName());
        }
        for (Method m : methods) {
            System.out.println("Method " + m.getName());
        }
    }
}


