package tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * This program demonstrates the  comparable and comparator interface.
 *  
 * @author Jayesh Soni
 * @since 2024-04-23
 */
class Product implements Comparable<Product> {

	private String name;
	private double price;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	// Implementing Comparable interface to compare products based on price
	@Override
	public int compareTo(Product other) {
		return Double.compare(this.price, other.price);
	}

}

// A comparator for comparing products based on their names
class ProductNameComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		return p1.getName().compareTo(p2.getName());
	}

}

public class ProductSorting {

	public static void main(String[] args) {
		// Create  list of products
		List<Product> products = new ArrayList<>();
		products.add(new Product("Laptop", 30000));
		products.add(new Product("Phone", 12000));
		products.add(new Product("Tablet", 8000));

		// Sort the products using Comparable (price-based sorting)
		Collections.sort(products);
		System.out.println("Sorted by price:");
		for(Product product : products) {
			System.out.println("Name =" + product.getName() + " price = " + product.getPrice());
		}

		// Sort the products using Comparator (name-based sorting)
		Collections.sort(products, new ProductNameComparator());
		System.out.println("\nSorted by name:");
		for(Product product : products) {
			System.out.println("Name =" + product.getName() + " price = " + product.getPrice());
		}
	}

}