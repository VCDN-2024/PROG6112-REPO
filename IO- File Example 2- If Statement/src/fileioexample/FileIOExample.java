
package fileioexample;


import java.io.*;
import java.util.Scanner;

public class FileIOExample {
    public static void main(String[] args) {

 String filepath = "C:\\Users\\dengovender\\OneDrive - ADvTECH Ltd\\Desktop\\VC WORK 2024\\SEMESTER 2\\Programming 1B- PROG 6112\\Session 35-36";
        
   
        File file = new File(filepath);

        if (file.exists() && file.canRead()) 
        {
            System.out.println("File is accessible.");
            
            // Prompt the user to display file contents
            System.out.print("Do you want to display the file's contents? (yes/no): ");
            
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine().trim().toLowerCase();
            
            if (userInput.equals("yes")) {
                // Display file contents here (you can use FileInputStream or FileReader)
                // For example, you can use FileReader to read and print the contents:
                try {
                    
                    //Insert code to read
                } catch (Exception e) {
                    System.err.println("Error reading and displaying file contents: " + e.getMessage());
                }
            } else {
                System.out.println("File contents not displayed.");
            }
            
            scanner.close();
        } else 
        {
            System.out.println("File is not accessible.");
        }
           
        }
    }


