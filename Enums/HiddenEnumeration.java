package Enums;

/**
 * You are given a hidden enum named Secret with some constants in uppercase.
 * Write a program that counts and prints how many constants in the enumeration start with "STAR".
 */

public class HiddenEnumeration {
    public static void main(String[] args) {
        int counter = 0;
        
        // write your code here
        for (Secret secret: Secret.values()) {
            if (secret.toString().contains("STAR")) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}

enum Secret {
    STAR, CRASH, START, // ...
}
