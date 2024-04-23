package tasks;

import java.util.Set;
import java.util.HashSet;

/**
 * This program demonstrates methods of set.
 * 
 * @author Jayesh Soni
 * @since 2024-04-23
 */
public class SetMethods {

	public static void main(String[] args) {
		// Create HashSet and store fruits name
		Set<String> fruitSet = new HashSet<>();

		// Add items to HashSet
		fruitSet.add("Mango");
		fruitSet.add("Watermelon");
		fruitSet.add("Muskmelon");
		fruitSet.add("Banana");

		// Print HashSet
		System.out.println(fruitSet);

		// Remove item from HashSet
		fruitSet.remove("Muskmelon");
		System.out.println(fruitSet);

		// Check if HashSet contains specific fruit
		boolean contains = fruitSet.contains("Muskmelon");
		System.out.println("Is fruitSet contains \"Muskmeln\"? " + contains);

		// Iterate through HashSet and print items
		for (String item : fruitSet) {
			System.out.println(item);
		}

		// Create another HashSet
		Set<String> anotherSet = new HashSet<>();

		// Add all items of fruitSet to anotherSet
		anotherSet.addAll(fruitSet);
		System.out.println(anotherSet);

		// Check if anotherSet is empty or not
		boolean isEmpty = anotherSet.isEmpty();
		System.out.println("Is anotherSet is empty ? " + isEmpty);

		// Create new HashSet and store vegetables
		Set<String> vegatableSet = new HashSet<>();
		vegatableSet.add("Potato");
		vegatableSet.add("Mango");
		vegatableSet.add("Palak");

		// Remove elements which are common with fruitSet
		vegatableSet.removeAll(fruitSet);
		System.out.println(vegatableSet);

		// Clear all items of vegetableSet
		vegatableSet.clear();
		System.out.println(vegatableSet);
	}

}