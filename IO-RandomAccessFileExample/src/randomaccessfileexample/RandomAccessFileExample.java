
package randomaccessfileexample;


import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {
    public static void main(String[] args) {
        // Writing data to a random access file- rw is open for reading and writing
        try (RandomAccessFile file = new RandomAccessFile("randomAccessFile.txt", "rw")) {
            // Writing data at specific positions
            file.writeBytes("Hello, this is a random access file");
            file.seek(10); // Move to the 10th position
            
            file.writeBytes("random ");
            
            file.seek(file.length()); // Move to the end of the file
            file.writeBytes(". This is the end of the file.");

            // Reading data from the random access file
            file.seek(0); // Move to the beginning of the file
            String line;
            
            while ((line = file.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
