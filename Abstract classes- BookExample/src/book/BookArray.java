
package book;


public class BookArray {
    public static void main(String[] args) {
        // Create an array to hold 10 Books
        Book[] books = new Book[10];

        // Populate the array with both Fiction and NonFiction books
        books[0] = new Fiction("Book Title 1");
        books[1] = new NonFiction("Book Title 2");
        books[2] = new Fiction("Book Title 3");
        books[3] = new NonFiction("Book Title 4");
        books[4] = new Fiction("Book Title 5");
        books[5] = new NonFiction("Book Title 6");
        books[6] = new Fiction("Book Title 7");
        books[7] = new NonFiction("Book Title 8");
        books[8] = new Fiction("Book Title 9");
        books[9] = new NonFiction("Book Title 10");

        // Display details about all 10 books using a for loop
        for (int i = 0; i < books.length; i++) {
            System.out.println("Book " + (i + 1) + ":");
            System.out.println("Title: " + books[i].getTitle());
            System.out.println("Price: R" + books[i].getPrice());
            System.out.println(); // Add a blank line for separation
            
        }
        
        // Another Display details about all 10 books using an enhanced for loop
       // int bookNumber = 1;
       // for (Book book : books) {
          //  System.out.println("Book " + bookNumber + ":");
           // System.out.println("Title: " + book.getTitle());
           // System.out.println("Price: R" + book.getPrice());
           // System.out.println(); // Add a blank line for separation
          //  bookNumber++;
       // }
        
// Another Display details about all 10 books using an enhanced for loop
       // int i = 0; // Initialize the index to 0
       // while (i < books.length) {
       //     System.out.println("Book " + (i + 1) + ":");
        //    System.out.println("Title: " + books[i].getTitle());
        //    System.out.println("Price: R" + books[i].getPrice());
        //    System.out.println(); // Add a blank line for separation
       //     i++; // Increment the index
       // }
    }
}

