package tasks;

import java.util.Scanner;

/**
 * This program allows users to input an array of integers and search specific
 * element and find index of it.
 *
 * @author Jayesh Soni
 * @since 2024-04-19
 */
public class ArrayIndexFinder {

	/**
	 * This method iterates through array and compares each element with the element
	 * that user entered and returns index of it if it is present in array otherwise
	 * it'll return -1.
	 * 
	 * @param array   The array in which user wants to search element to find index.
	 * @param element The element to find index.
	 * @return The index of element if found in array, otherwise it returns -1.
	 */
	public static int findIndex(int[] array, int element) {
		for (int currentIndex = 0; currentIndex < array.length; currentIndex++) {
			if (array[currentIndex] == element) {
				return currentIndex;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input array limit
		System.out.print("Enter the elements in array:");
		int arrayLimit = scanner.nextInt();

		// Initialize array
		int[] inputArray = new int[arrayLimit];

		// Input values in array
		System.out.println("Enter array elements:");
		for (int currentIndex = 0; currentIndex < arrayLimit; currentIndex++) {
			inputArray[currentIndex] = scanner.nextInt();
		}

		// Input element to find it's index
		System.out.print("Enter element to find it's index:");
		int element = scanner.nextInt();

		// Call the findeIndex method
		int foundIndex = findIndex(inputArray, element);

		// Display the result
		if (foundIndex > 0) {
			System.out.print("The index of " + element + " is " + foundIndex);
		} else {
			System.out.println("The element is not in the array");
		}
	}

}