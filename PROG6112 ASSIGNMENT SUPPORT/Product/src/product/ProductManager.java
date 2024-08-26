
package product;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductManager {
    private ArrayList<Product> products;
    private Scanner scanner; 


    public ProductManager() {
        products = new ArrayList<>(); 
        scanner = new Scanner(System.in); 
    }
  
    public void saveProduct() {
        scanner.nextLine(); 
        System.out.print("Enter Product ID: ");
        String productId = scanner.nextLine();
        System.out.print("Enter Product Name: ");
        String productName = scanner.nextLine();

        int productQuantity = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter Product Quantity: ");
            try {
                productQuantity = scanner.nextInt();
                if (productQuantity < 10) {
                    System.out.println("Quantity must be at least 10. Please re-enter.");
                } else {
                    validInput = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a numeric value for quantity.");
                scanner.next(); 
            }
        }

        Product newProduct = new Product(productId, productName, productQuantity);
        products.add(newProduct);
        System.out.println("Product saved successfully.");
    }
    
      public void saveProduct(String productId, String productName, int productQuantity) {
        Product newProduct = new Product(productId, productName, productQuantity);
        products.add(newProduct);
        System.out.println("Product saved successfully.");
    }
//scanner.hasNextInt
    
   
    public Product searchProduct(String productId) {
        for (Product product : products) {
            if (product.getProductId().equalsIgnoreCase(productId)) {
                return product;  
            }
        }
        return null; 
    }

 
    public void deleteProduct() {
        scanner.nextLine(); 
        System.out.print("Enter Product ID to delete: ");
        String productId = scanner.nextLine();
        boolean found = false;

        for (Product product : products) {
            if (product.getProductId().equalsIgnoreCase(productId)) {
                System.out.print("Are you sure you want to delete this product? (y/n): ");
                String confirmation = scanner.nextLine();
                if (confirmation.equalsIgnoreCase("y")) {
                    products.remove(product);
                    System.out.println("Product deleted successfully.");
                } else {
                    System.out.println("Deletion canceled.");
                }
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product not found.");
        }
    }


    public void printProductReport() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
        } else {
            System.out.println("\nProduct Report:");
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

    
    public void exitApplication() {
        System.out.println("Exiting application. Goodbye!");
    }


    public ArrayList<Product> getProducts() {
        return products;
    }


    public void launchMenu() {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Save a new product");
            System.out.println("2. Search for a product");
            System.out.println("3. Delete a product");
            System.out.println("4. Print product report");
            System.out.println("5. Exit application");
            System.out.print("Enter your choice: ");
            
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Exiting application.");
                break;
            }

            switch (choice) {
                case 1:
                    saveProduct(); 
                    break;
                case 2:
                    scanner.nextLine(); 
                    System.out.print("Enter Product ID to search: ");
                    String searchId = scanner.nextLine();
                    Product foundProduct = searchProduct(searchId);
                    if (foundProduct != null) {
                        System.out.println("Product found: " + foundProduct);
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                case 3:
                    deleteProduct(); 
                    break;
                case 4:
                    printProductReport();
                    break;
                case 5:
                    exitApplication(); 
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }


    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        System.out.print("Press 1 to launch menu, any other key to exit: ");
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();

        if (choice.equals("1")) {
            manager.launchMenu();
        } else {
            System.out.println("Exiting application. Goodbye!");
        }
    }
}
