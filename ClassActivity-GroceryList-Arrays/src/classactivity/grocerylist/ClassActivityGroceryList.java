package classactivity.grocerylist;
//The Arrays class in java.util package is a part of the Java Collection Framework
//This class provides static methods to dynamically create and access Java arrays
import java.util.Arrays;
public class ClassActivityGroceryList {

   
    public static void main(String[] args) {
         // Creating an array to represent a grocery list
        String[] GroceryItems = {"Potatoes", "Onions", "Milk", "Bread", "Eggs", "Tomatoes","Rice"};
     
        // Sorting the grocery list alphabetically
        Arrays.sort(GroceryItems);

        System.out.println("Sorted grocery list: " + Arrays.toString(GroceryItems));

        // Searching for an item in the grocery list
        //Lets assume the user gave the following value
        String searchItem = "Milk";
 
        int index = Arrays.binarySearch(GroceryItems, searchItem);
   
        if (index >= 0) {
            System.out.println("The item " + searchItem + " is found in the Grocery list ");
        } else {
            System.out.println(searchItem + " is not found in the list.");
        }
        
        
    }
    
}
