package bubblesortnames;

public class BubbleSortNames {

    public static void Bubblesort(String [] names)
    {
          int ArrayLength = names.length;
          // this will be used for optimising the algorithm and 
          //avoiding unnecessary iterations if the array is already sorted
          boolean swapped;
     //for loop  (declare and initialise; condition; incremental) 
        for (int index = 0; index < ArrayLength - 1; index++) {
          
// The condition ensures that the loop will continue until index reaches
          //the second-to-last element of the array (Hence the -1)
                       
         //intially we set it to false. 
         //Do not set it out the loop otherwise you lose optimisation
            swapped = false;
            
            for (int j = 0; j < ArrayLength - index - 1; j++) 
            {
                
                
                if (names[j].compareTo(names[j + 1]) > 0)
                {
                    // Swap names[j] and names[j + 1]
                    String temp = names[j];
                    
                    names[j] = names[j + 1];
                    
                    names[j + 1] = temp;
                    
                    
                    swapped = true;// set to true
                        }
            }
        
// If no two elements were swapped in the inner loop, the array is already sorted
            if (!swapped) {
                break;

}
        }
    }
    public static void main(String[] args) {
         String[] names = { "John", "Alice", "Bob", "David", "Eve" };
        
        System.out.println("Names before sorting:");
        for (String name : names) {
            System.out.println(name);
        }
        
        Bubblesort(names);
        
        System.out.println("\nNames after sorting:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

