
package insertionsortexample;


public class InsertionSortExample {

       public static void main(String[] args) {
      int [] array ={5,8,1,4,7,3};
      System.out.println("The orignal array Structure");
      for (int num : array)
      {
      System.out.print( num + "");
     // System.out.println( num + "");
      }
        System.out.println("-------------------------");
      //Call your method
      InsertionSort(array);
      
      System.out.println("The Array Sorted using insertion Sort");
      for (int num : array)
      {
      System.out.print( num + "");
     // System.out.println( num + "");
      }
    }
       
       //Title: Insertion Sort Algorithm
       //Author:Rajat Mishra
       //Date: 28 june 2024
       //Version: 1
       //Availabilty:geeksforgeeks.org/insertion-sort-algorithm/ 
       
    public static void InsertionSort(int [] myarray)
    {
          // int n = myarray.length;
        for (int i = 1; i < myarray.length; ++i) {//Outer loop
            //Loop starts from the second element( index 1)
            //and iterates through the array
            
            int key = myarray[i];//Key is the element currently being inserted
                                // into the sorted portion of the array
            int j = i - 1;// j is the index of teh last element in the sorted
                          // portion of the array
                          
            while (j >= 0 && myarray[j] > key) {//Inner Loop (Shifting of Elements)
                //Two conditions to be checked
              
                myarray[j + 1] = myarray[j];//Element is shifted one portion to the right
               
                j = j - 1;//Decrement to check the previous element in the next iteration
            }
            myarray[j + 1] = key;//After the loop , key is placed in its correct position
                                //within the sorted portion
        }
    }
}
