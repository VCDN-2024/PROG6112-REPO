
package sequentialtextfileexample;

import java.io.*;

public class SequentialTextFileExample {
    public static void main(String[] args) {
        // Writing data to a text file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt"))) {
            writer.write("Hello, this is a text file.\n");
            writer.write("This is the second line.\n");
            writer.write("This is the third line.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading data from a text file
        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
