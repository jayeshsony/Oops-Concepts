package tasks;

import java.util.HashMap;
import java.util.Map;

/**
 * This program demonstrates the methods of Map.
 * 
 * @author Jayesh Soni
 * @since 2024-04-23
 */
public class MapMethods {

	public static void main(String[] args) {
		// Create HashMap
		Map<String, Integer> firstMap = new HashMap<>();

		// Add items to HashMap
		firstMap.put("Jayesh", 20);
		firstMap.put("Naitik", 25);
		firstMap.put("Abc", 27 );
		firstMap.put("Xyz", 28);

		// Get the value 
		int age = firstMap.get("Jayesh");
		System.out.println("Age of Jayesh: " + age);

		// Check if HashMap contains specific key
		boolean containsKey = firstMap.containsKey("Naitik");
		System.out.println("Is the map contain Naitik? " + containsKey);

		// Check if HashMap contains specific value
		boolean containsValue = firstMap.containsValue(30);
		System.out.println("Is map contain age 30? " + containsValue);

		// Get the size of HasMap
		System.out.println("Size of the map: " + firstMap.size());

		// Remove specific item using key
		firstMap.remove("Xyz");
		System.out.println("Map after remove: " + firstMap);

		// Iterate through HashMap 
		for(Map.Entry<String, Integer> entries : firstMap.entrySet()) {
			System.out.println(entries.getKey() + " = " + entries.getValue());
		}

		// Create new HashMap 'secondMap' and copy all items of 'firstMap'
		Map<String, Integer> secondMap = new HashMap<>();
		secondMap.putAll(firstMap);
		System.out.println(secondMap);

		// Clear all items of firstMap
		firstMap.clear();
	}

}