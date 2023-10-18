package IOstreams;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountWords {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // start coding here

        String text = reader.readLine();

        if(!text.isBlank()) {
            boolean marker = false;
            int counter = 0;
            for (int i = 0; i < text.length(); i++) {
                if(text.charAt(i) != ' ') {
                    marker = true;
                }
                if( ((text.charAt(i) == ' ' || i == text.length() - 1) && marker)) {
                    counter++;
                    marker = false;
                }
            }
            System.out.println(counter);
        } else {
            System.out.println(0);
        }
        reader.close();
    }
}
