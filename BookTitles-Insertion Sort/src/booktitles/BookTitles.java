
package booktitles;

import java.util.Arrays;
public class BookTitles {
       //Title: Insertion Sort Algorithm
       //Author:Rajat Mishra
       //Date: 28 june 2024
       //Version: 1
       //Availabilty:geeksforgeeks.org/insertion-sort-algorithm/ 
    public static void insertionSort(String[] books) {
//        
        for (int i = 1; i < books.length; ++i) {
          
            
            String key = books[i];//String-Because you working with Text
            int j = i - 1;
                          
            while (j >= 0 && books[j].compareTo(key)>0) {
//Switch the > to < for Descending

//compareTo- Because you working with Text
              
                books[j + 1] = books[j];
               
                j = j - 1;
            }
            books[j + 1] = key;
        }
       
    }
        
    
 
    public static void main(String[] args) {
     String[] books = {"Harry Potter", "The Great Gatsby", "To Kill a mocking bird", "Pride and Prejudice", "Othello"};

        System.out.println("This the original layout of the array:");
        System.out.println(Arrays.toString(books));

        insertionSort(books);

        System.out.println("This is the array after being sorted array:");
        System.out.println(Arrays.toString(books));
    }
    
}
