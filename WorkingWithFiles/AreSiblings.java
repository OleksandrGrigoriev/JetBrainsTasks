package WorkingWithFiles;

/**
 * Implement the method areSibling that checks if the files have the same parent.
 * It should take two files and return true if the files have the same parent and false otherwise.
 */

import java.io.File;

public class AreSiblings {
    public static void main(String[] args) {

    }
    public static boolean areSiblings(File f1, File f2) {
        // implement me
        if (f1.getParent().equals(f2.getParent()))
            return true;
        return false;
    }
}
