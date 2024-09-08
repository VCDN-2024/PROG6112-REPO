
package multipleexceptionsexample;

import java.io.FileReader;
import java.io.IOException;

public class MultipleExceptionsExample {

    // Method that throws different types of exceptions
    public void handleMultipleExceptions() throws IOException, ArithmeticException, NullPointerException {
        // 1. File-related exception (Checked Exception)
        FileReader file = new FileReader("nonexistent_file.txt"); // This can throw IOException if file doesn't exist

        // 2. Arithmetic exception (Unchecked Exception)
        int result = 10 / 0; // This will throw ArithmeticException because dividing by zero is not allowed

        // 3. Null pointer exception (Unchecked Exception)
        String nullString = null;
        System.out.println(nullString.length()); // This will throw NullPointerException because null has no length
    }

    public static void main(String[] args) {
        MultipleExceptionsExample example = new MultipleExceptionsExample();
        try {
            // Call the method that may throw multiple exceptions
            example.handleMultipleExceptions();
        } catch (IOException e) {
            // Handle the case where the file is not found or cannot be read
            System.out.println("File not found or error reading file: " + e.getMessage());
        } catch (ArithmeticException e) {
            // Handle division by zero errors
            System.out.println("Error: Cannot divide by zero!");
        } catch (NullPointerException e) {
            // Handle null pointer exceptions (attempting to access a null object)
            System.out.println("Error: Null object encountered!");
        } finally {
            // This block always runs, no matter what (useful for cleanup actions)
            System.out.println("Execution completed. Cleaning up resources...");
        }
    }
}

