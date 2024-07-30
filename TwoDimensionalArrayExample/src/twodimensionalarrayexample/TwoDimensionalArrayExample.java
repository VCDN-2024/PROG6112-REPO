
package twodimensionalarrayexample;
public class TwoDimensionalArrayExample {
    public static void main(String[] args) {
      int [][] TwoDimensionalArray = {//Array with 3 rows and 4 columns
          {1,2,3,4},
          {5,6,7,8},
          {9,10,11,12}
      };
      //Accessing elements in the array
      int ElementAtRow1Column2=TwoDimensionalArray[1][2];
      
System.out.println("the element at position [1][2] is:  " +ElementAtRow1Column2);
    //Display all elements within array
    //Call your method
    DisplayArray(TwoDimensionalArray);
    }//End of main method
    
//Title: Multidimensional Arrays in Java
//Author:geeksforgeeks
//Date: 23 September 2023
//Version: 1
//Availability:  https://www.geeksforgeeks.org/multidimensional-arrays-in-java/   
    public static void DisplayArray(int [][] numbers)
    {
       for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}//End of class
