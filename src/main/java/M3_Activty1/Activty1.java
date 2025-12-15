package M3_Activty1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Activty1 {

	public static void main(String[] args) {

		List<String> products = new ArrayList<>();
		products.add("Laptop");
		products.add("Mouse");
		products.add("Keyboard");
		products.add("Monitor");
		products.add("Printer");

		System.out.println("All products:");
		printOutput(products);

		products.add("Webcam");
		products.remove("Mouse");

		System.out.println("After adding and removing products:");
		printOutput(products);

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter product name to search: ");
			String searchProduct = scanner.nextLine();

			boolean found = false;
			for (String product : products) {
				if (product.equalsIgnoreCase(searchProduct)) {
					found = true;

				}

			}

			if (products.contains(searchProduct) || found) {
				System.out.println("Product found: " + searchProduct);
			} else {
				System.out.println("Product not found.");
			}

		}

	}

	private static void printOutput(List<String> products) {
		int count = 1;
		for (String product : products) {
			System.out.println(count + ". " + product);
			count++;
		}

	}

}
