package M3_Activity2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Activty2 {

    public static void main(String[] args) {

        Set<String> products = new HashSet<>();
        products.add("Laptop");
        products.add("Monitor");
        products.add("Mouse");
        products.add("Keyboard");
        products.add("Printer");

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\nSelect an option:");
            System.out.println("1. Search a product");
            System.out.println("2. Add a product");
            System.out.println("3. Print all products and count");
            System.out.println("4. Exit");
            System.out.print("> ");

            option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (option) {

                case 1:
                    // Search a product
                    System.out.print("Enter product name to search: ");
                    String search = scanner.nextLine();

                    if (products.contains(search)) {
                        System.out.println("Product found: " + search);
                    } else {
                        System.out.println("Product not found!");
                    }
                    break;

                case 2:
                    System.out.print("Enter product name to add: ");
                    String newProduct = scanner.nextLine();

                    if (products.add(newProduct)) {
                        System.out.println("Product added: " + newProduct);
                    } else {
                        System.out.println("Product already exists!");
                    }
                    break;

                case 3:
                    System.out.println("\nAll products:");
                    for (String product : products) {
                        System.out.println(product);
                    }
                    System.out.println("Total unique products: " + products.size());
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
            

        } while (option != 4);

        scanner.close();
    }
    
}
