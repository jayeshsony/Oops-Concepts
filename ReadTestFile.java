package tasks;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

/**
 * This program reads 'myTestFile.txt' file and prints it line by line.
 * 
 * @author Jayesh Soni
 * @since 2024-04-23
 */
public class ReadTestFile {

	public static void main(String[] args) throws IOException {
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;

		try {
			fileReader = new FileReader("myTestFile.txt"); // Create FileReader instance
			bufferedReader = new BufferedReader(fileReader); // Create BufferedReader instance from FileReader
			String line;
			// Read and print each line of file
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("Opearation failed");
		} finally {
			fileReader.close(); // Close the file
		}
	}

}