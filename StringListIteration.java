package tasks;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * This program demonstrates the use of iterator.<br>
 * It adds string to ArrayList and prints the each elements of list using iterator.
 * 
 * @author Jayesh Soni
 * @since 2024-04-23
 */
public class StringListIteration {

	public static void main(String[] args) {
		// Create an ArrayList to store strings
		ArrayList<String> stringList = new ArrayList<>();

		// Add strings to ArrayList
		stringList.add("Hello");
		stringList.add("World!");
		stringList.add("Jayesh");

		// Retrieve an iterator for ArrayList
		Iterator<String> stringIterator = stringList.iterator();

		// Print values using iterator
		System.out.println("Printing values using iterator");
		while (stringIterator.hasNext()) {
			System.out.println("- " + stringIterator.next());
		}
	}

}