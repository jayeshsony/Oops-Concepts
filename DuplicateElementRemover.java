package tasks;

import java.util.ArrayList;
import java.util.List;

/**
 * This program checks the entire list and if it finds any duplicate element
 * then it removes from list.
 * 
 * @author Jayesh Soni
 * @since 2024-04-19
 *
 */
public class DuplicateElementRemover {

	/**
	 * A method of DuplicateElementRemover class. 
	 * This method iterates through entire list and removes the duplicate element if its's found
	 * 
	 * @param alphabetList The list in which in which user wants to remove duplicate elements
	 */
	public static void duplicateRemover(List<String> alphabetList) {
		// Loop through each element of list
		for (int previousIndex = 0; previousIndex < alphabetList.size(); previousIndex++) {
			for (int nextIndex = previousIndex + 1; nextIndex < alphabetList.size(); nextIndex++) {
				// Compare the elements
				if (alphabetList.get(previousIndex) == alphabetList.get(nextIndex)) {
					// Remove duplicate element
					alphabetList.remove(nextIndex);
					// Decrease nextIndex to adjust for the removed element
					nextIndex--;
				}
			}
		}
	}

	public static void main(String[] args) {
		// Create list to store elements
		List<String> alphabetList = new ArrayList<>();

		// Add elements to the list
		alphabetList.add("A");
		alphabetList.add("B");
		alphabetList.add("C");
		alphabetList.add("D");
		alphabetList.add("A");
		alphabetList.add("C");
		alphabetList.add("E");
		alphabetList.add("E");
		alphabetList.add("E");

		// Print original list
		System.out.println("Original list = " + alphabetList);

		// Call the duplicateRemover method
		duplicateRemover(alphabetList);

		// Print list after removing duplicate elements
		System.out.println("List after removing duplicate elements : " + alphabetList);
	}

}