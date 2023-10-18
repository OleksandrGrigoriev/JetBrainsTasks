package IOstreams;

import java.io.*;

public class ReadData {
    public static void main(String[] args) throws IOException {
        File file = new File("input.txt");
        byte[] bytesArray = new byte[(int)file.length()];
        // What is the correct line of code to place here?

        //correct -> FileInputStream fis = new FileInputStream(file); fis.read(bytesArray, 0, bytesArray.length); fis.close();

        //correct -> FileInputStream fis = new FileInputStream(file); fis.read(bytesArray); fis.close();

        //FileInputStream fis = new FileInputStream(file); fis.write(bytesArray); fis.close();

        //FileReader fr = new FileReader(file); fr.read(bytesArray, 0, bytesArray.length); fr.close();
    }
}
