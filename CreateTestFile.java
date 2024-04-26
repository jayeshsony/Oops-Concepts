package tasks;

import java.io.FileWriter;
import java.io.IOException;

/**
 * This program creates a new file 'myTestFile' and writes some information into it.
 * 
 * @author Jayesh Soni
 * @since 2024-04-23
 */
public class CreateTestFile {

	public static void main(String[] args) {
		try {
			FileWriter myTestFile = new FileWriter("MyTestFile.txt"); // Create new file

			// Write personal inforamtion into file
			myTestFile.write("Name : Jayesh Soni\n");
			myTestFile.write("Age : 20\n");
			myTestFile.write("Address : Avadh PG, lilanagar , ahemdabad\n");
			myTestFile.close();
			System.out.println("Successfully created file");
		} catch (IOException e) {
			System.out.println("Operation failed");
		}
	}

}
