
package filepath;

import java.io.*;//Import to allow access to FileReader and BufferedReader
import java.nio.file.*;//Import to allow access to Path and Paths

public class FilePath {
    public static void main(String[] args) {
        // Define the directory and file name
        String directory = "C:\\Users\\dengovender\\Downloads";
        String fileName = "Example.txt";

        // Create a Path object using Paths.get()
        Path filePath = Paths.get(directory, fileName);//Combines the two into a single path

        
        // Convert the Path to a String for file operations
        String filePathString = filePath.toString();

       // Read from the file
        try {
            FileReader fileReader = new FileReader(filePathString);
            //The object created which allows reading the contents of the file specified by the path
           
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            //Wraps the Filereader for efficient reading of text from the file
            
         
            System.out.println("Reading from the file:");
            //Using a loop to read from the file- line by line
            String line;
            while ((line = bufferedReader.readLine()) != null) 
            {
                System.out.println(line);
            }
            
            bufferedReader.close();//Resource cleanup
        } 
        catch (IOException e) {
            System.err.println("Error reading from the file: " + e.getMessage());
        }
           
       
        
    }
}

