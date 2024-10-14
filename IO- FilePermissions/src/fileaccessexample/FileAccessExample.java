
package fileaccessexample;


import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class FileAccessExample {
    public static void main(String[] args) {
        // Define the path to the file you want to work with
   Path filePath = Paths.get("C:/Users/dengovender/OneDrive - ADvTECH Ltd/Desktop/VC WORK 2023/Example.txt");

        // Check if the file exists- Checking the reference to the target file
        boolean fileExists = Files.exists(filePath, LinkOption.NOFOLLOW_LINKS);
        System.out.println("File exists: " + fileExists);

        // Check if the file is readable
        boolean isReadable = Files.isReadable(filePath);
        System.out.println("File is readable: " + isReadable);

        // Check if the file is writable
        boolean isWritable = Files.isWritable(filePath);
        System.out.println("File is writable: " + isWritable);

        // Check if the file is executable
        boolean isExecutable = Files.isExecutable(filePath);
        System.out.println("File is executable: " + isExecutable);

        // Print file attributes using BasicFileAttributes
        try {
            BasicFileAttributes fileAttributes = Files.readAttributes(filePath, BasicFileAttributes.class);
            System.out.println("File size: " + fileAttributes.size() + " bytes");
            System.out.println("Creation time: " + fileAttributes.creationTime());
            System.out.println("Last modified time: " + fileAttributes.lastModifiedTime());
              
        } catch (IOException e) {
            System.err.println("Error reading file attributes: " + e.getMessage());
        }
    }
}

