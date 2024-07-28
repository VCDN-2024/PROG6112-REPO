
package bubblesortexample;
//In the context of working with NetBeans applications, a package refers to a way of organising and grouping related Java classes and resources together.

public class BubbleSortExample {
// class serves as a container for the bubble sort algorithm implementation

    public static void bubbleSort(int[] array) { 
//creating a static method that takes an integer array as a parameter
// This method will be used for performing the bubble sort algorithm on the given array
        
 int n = array.length;
// establish the number of elements in your array
       
        boolean swapped;
// this will be used for tracking whether the elements have been swapped during a pass through the array.
// Declartion, condition and Incremental                                                                                                                         
       
            for (int i = 0; i < n - 1; i++) { // n = array.length
                
 //This line starts a loop that iterates n - 1 times. It represents the number of passes required to sort the array.
 //The variable i keeps track of the pass number.
            
            swapped = false;// at the beginning of each pass. It assumes no swaps have occurred yet.
            
            for (int j = 0; j < n - i - 1; j++) {
                //This line starts an inner loop that iterates over the unsorted portion of the array. 
                //The variable j represents the current index in the unsorted portion.
                
                if (array[j] > array[j + 1]) {
                    // Swap elements
                    //This line checks if the current element is greater than the next element in the array. 
                    //If so, a swap is needed to bring the larger element towards the end.
                   
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
//These lines perform the swapping of elements. 
//The current element is stored in a temporary variable temp, 
//then the current element is replaced with the next element,
//and the next element is replaced with the temporary variable value.
                   
                    swapped = true;
//This line sets the swapped flag to true to indicate that a swap occurred during this pass
                    }
            }

            // If no two elements were swapped in the inner loop, the array is already sorted
            //This line checks if no swaps were made during the inner loop. 
            
            //If no swaps occurred, it means the array is already sorted, so the outer loop can be terminated early using the break statement
                
            if (!swapped) {
                break;
            }
        }
    }
 public static void main(String[] args) {// here is your main method and entry point into the program
     // Here you can initialize your array and provide a set of values obviously unsorted
        int[] numbers = {5, 2, 4, 3,6};
        
        
        //Next is to display our values
        //What better than to do a before and after
        System.out.println("Array before sorting:");
        for (int num : numbers) {
            //This line starts a loop that iterates over each element in the numbers array. 
            //It prints each element followed by a space, creating a horizontal representation of the array before sorting.
            
            System.out.print(num + " ");
        }
        
        bubbleSort(numbers);// here we call the method to invoke the bubblesort algorithm
        
        System.out.println("\nArray after sorting in ascending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
//In the descending version, elements are swapped when the current element is smaller than the next element 
//(array[j] < array[j + 1]). Check the comparison sign
//This pushes the smaller elements towards the end of the array, gradually sorting it in descending order.
//By modifying the comparison condition, you can control the direction in which the bubble sort algorithm sorts the array.


