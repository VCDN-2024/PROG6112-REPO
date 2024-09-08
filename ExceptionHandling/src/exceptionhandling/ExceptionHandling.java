

package exceptionhandling;


public class ExceptionHandling {
    
// A method that may throw an ArithmeticException
    public static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }
 
    public static void main(String[] args) {
    // Example 1: Handling ArithmeticException
        try 
        {
            int result = divide(10, 0); // Attempt to divide by zero
            System.out.println("Result: " + result); // This line won't be executed
        } 
        catch (ArithmeticException ex) {
            System.out.println("Error: Division by zero");
        }
        finally {//This is optional
            System.out.println("Finally block executed");
        }
        
         // Example 2: Handling ArrayIndexOutOfBoundsException
        try {
            int[] numbers = {1, 2, 3};
            int value = numbers[5]; // Attempt to access an element beyond the array's bounds
        } 
        catch (ArrayIndexOutOfBoundsException ex) {
        System.out.println("Error: Array index out of bounds");
        }
    }
}

