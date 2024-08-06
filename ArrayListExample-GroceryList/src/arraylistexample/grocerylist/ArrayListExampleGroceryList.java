
package arraylistexample.grocerylist;

//Import the package and class
import java.util.*;

public class ArrayListExampleGroceryList {

   
    public static void main(String[] args) {
       
         //groceryList is your variable- String is the data type
         //new ArrayList<>()- creates a new instance of the ArrayList class
         //The ArrayList is your container where you will add,
         //remove and manage your strings easily
         
        ArrayList<String> groceryList = new ArrayList<>();  
// Create an ArrayList to store grocery items

        // Add items to the list
        groceryList.add("Apples");
        groceryList.add("Bread");
        groceryList.add("Milk");
        groceryList.add("Eggs");
        groceryList.add("Potatoes");
        groceryList.add("Onions");
        groceryList.add("Meat");
        
        // Print the items in the list
        System.out.println("Grocery List:");
        
        //String is your datatype
        //item is a variable that you will use to represent each element as you loop through in your grocerylist
        //The groceryList is your collection
        for (String item : groceryList) // here is our loop to gather all ur elements
          {
            System.out.println(item);//Print your list
        }

        // Remove an item from the list
        groceryList.remove("Bread");
        groceryList.remove("Meat");
        
        
        // Print the updated list
        System.out.println("\nUpdated Grocery List:");
        for (String UpdatedItem : groceryList) {
            System.out.println(UpdatedItem);
            
            //Sort my ArrayList
            
            Collections.sort(groceryList);
            
              System.out.println("\n MyGrocery List:");
        for (String i : groceryList) {
            System.out.println(i);
        }
        
    }
    }
}
